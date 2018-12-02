package solutions.tveit.nissanconnect;

import retrofit2.Call;
import solutions.tveit.nissanconnect.api.NissanConnectApi;
import solutions.tveit.nissanconnect.api.initialapp.InitialAppResponse;
import solutions.tveit.nissanconnect.api.userlogin.UserLoginResponse;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

class LoginService {

    private final String defaultLanguage = "en-US";
    private final String initialAppStrings = "geORNtsZe5I4lRGjG9GZiA";

    private final NissanConnectApi api;

    LoginService(NissanConnectApi api) {
        this.api = api;
    }

    LoginInfo login(Region region, String userId, String password) {
        try {
            String key = getPasswordEncryptionKey(region);
            String base64EncodedEncryptedPassword = encryptPassword(password, key);

            Call<UserLoginResponse> userLoginResponseCall = api.userLoginRequest(
                    region.code(),
                    defaultLanguage,
                    initialAppStrings,
                    userId,
                    base64EncodedEncryptedPassword);
            UserLoginResponse userLoginResponse = userLoginResponseCall.execute().body();


            String nickname = userLoginResponse.getVehicleInfoList().getVehicleInfo().get(0).getNickname();
            String sessionId = userLoginResponse.getVehicleInfoList().getVehicleInfo().get(0).getCustomSessionid();
            String vin = userLoginResponse.getVehicleInfoList().getVehicleInfo().get(0).getVin();
            String dcmid = userLoginResponse.getCustomerInfo().getVehicleInfo().getDCMID();
            String userVehicleBoundTime = userLoginResponse.getCustomerInfo().getVehicleInfo().getUserVehicleBoundTime();
            String timezone = userLoginResponse.getCustomerInfo().getTimezone();
            String language = userLoginResponse.getCustomerInfo().getLanguage();
            String regionCode = userLoginResponse.getCustomerInfo().getRegionCode();
            String eMailAddress = userLoginResponse.getCustomerInfo().getEMailAddress();

            return new LoginInfo(nickname, sessionId, vin, dcmid, userVehicleBoundTime, timezone, language, regionCode, eMailAddress);
        } catch (IOException e) {
            throw new NissanConnectException(e);
        }
    }

    private String getPasswordEncryptionKey(Region region) throws IOException {
        Call<InitialAppResponse> initialAppResponseCall = api.initialApp(region.code(), defaultLanguage, initialAppStrings);
        InitialAppResponse initialAppResponse = initialAppResponseCall.execute().body();
        return initialAppResponse.getBaseprm();
    }

    private String encryptPassword(String password, String key) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] encryptedPassword = cipher.doFinal(password.getBytes());
            return Base64.getEncoder().encodeToString(encryptedPassword);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            throw new NissanConnectException(e);
        }
    }

}
