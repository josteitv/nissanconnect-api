package solutions.tveit.nissanconnect;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import solutions.tveit.nissanconnect.api.NissanConnectApi;
import solutions.tveit.nissanconnect.api.acremoterequest.AcRemoteRequestResponse;
import solutions.tveit.nissanconnect.api.acremoteresult.AcRemoteResultResponse;
import solutions.tveit.nissanconnect.api.batterystatuscheck.BatteryStatusCheckResponse;
import solutions.tveit.nissanconnect.api.batterystatuscheckresult.BatteryStatusCheckResultResponse;
import solutions.tveit.nissanconnect.api.batterystatusrecords.BatteryStatusRecordsResponse;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class NissanConnectService {

    private static final String BASE_URL = "https://gdcportalgw.its-mo.com/gworchest_160803EC/gdc/";

    private final NissanConnectApi api;
    private LoginInfo loginInfo;

    public NissanConnectService() {
        this(BASE_URL);
    }

    public NissanConnectService(String baseUrl) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(Level.NONE);

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new ErrorResponseInterceptor())
                .addInterceptor(logging)
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();

        api = retrofit.create(NissanConnectApi.class);
    }

    public void login(Region region, String userId, String password) {
        loginInfo = new LoginService(api).login(region, userId, password);
    }

    public BatteryStatusRecordsResponse getBatteryStatusRecords() {
        try {
            Call<BatteryStatusRecordsResponse> call = api.batteryStatusRecordsRequest(loginInfo.getRegionCode(), loginInfo.getLanguage(), loginInfo.getSessionId(), loginInfo.getDcmid(), loginInfo.getTimezone(), loginInfo.getVin(), loginInfo.getUserVehicleBoundTime());
            return call.execute().body();
        } catch (IOException e) {
            throw new NissanConnectException(e);
        }
    }

    public BatteryStatusCheckResultResponse getBatteryStatus() {
        try {
            Call<BatteryStatusCheckResponse> call = api.batteryStatusCheckRequest(loginInfo.getRegionCode(), loginInfo.getLanguage(), loginInfo.getSessionId(), loginInfo.getDcmid(), loginInfo.getTimezone(), loginInfo.getVin(), loginInfo.getEmailAddress());
            BatteryStatusCheckResponse batteryStatusCheckResponse = call.execute().body();
            String resultKey = batteryStatusCheckResponse.getResultKey();

            return poll(() -> {
                BatteryStatusCheckResultResponse response = api.batteryStatusCheckResultRequest(
                        loginInfo.getRegionCode(),
                        loginInfo.getLanguage(),
                        loginInfo.getSessionId(),
                        loginInfo.getDcmid(),
                        loginInfo.getTimezone(),
                        loginInfo.getVin(),
                        loginInfo.getEmailAddress(),
                        resultKey).execute().body();
                return "1".equals(response.getResponseFlag()) ? response : null;
            });
        } catch (IOException e) {
            throw new NissanConnectException(e);
        }
    }

    public AcRemoteResultResponse turnAcOn() {
        try {
            Call<AcRemoteRequestResponse> call = api.acRemoteRequest(loginInfo.getRegionCode(), loginInfo.getLanguage(), loginInfo.getSessionId(), loginInfo.getDcmid(), loginInfo.getTimezone(), loginInfo.getVin(), loginInfo.getEmailAddress());
            AcRemoteRequestResponse requestResponse = call.execute().body();
            String resultKey = requestResponse.getResultKey();

            return poll(() -> {
                AcRemoteResultResponse response = api.acRemoteResult(
                        loginInfo.getRegionCode(),
                        loginInfo.getLanguage(),
                        loginInfo.getSessionId(),
                        loginInfo.getDcmid(),
                        loginInfo.getTimezone(),
                        loginInfo.getVin(),
                        loginInfo.getEmailAddress(),
                        resultKey).execute().body();
                return "1".equals(response.getResponseFlag()) ? response : null;
            });
        } catch (IOException e) {
            throw new NissanConnectException(e);
        }
    }


    public void turnAcOff() {

    }

    private static <T> T poll(PollFunction<T> pollFunction) throws IOException {
        final int maxRetries = 10;
        int retryCount = 0;
        while (true) {
            T result = pollFunction.getResult();
            if (result != null) {
                return result;
            }

            retryCount++;
            if (retryCount == maxRetries) {
                throw new NissanConnectException(pollFunction.getClass().getName() + " - No result after " + maxRetries + " attempts. Giving up.");
            }

            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                // ignore
            }
        }
    }

}
