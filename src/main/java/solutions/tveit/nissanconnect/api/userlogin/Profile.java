package solutions.tveit.nissanconnect.api.userlogin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profile {

    @SerializedName("vin")
    @Expose
    private String vin;

    @SerializedName("gdcUserId")
    @Expose
    private String gdcUserId;

    @SerializedName("gdcPassword")
    @Expose
    private String gdcPassword;

    @SerializedName("encAuthToken")
    @Expose
    private String encAuthToken;

    @SerializedName("dcmId")
    @Expose
    private String dcmId;

    @SerializedName("nickname")
    @Expose
    private String nickname;

    @SerializedName("modelyear")
    @Expose
    private String modelyear;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getGdcUserId() {
        return gdcUserId;
    }

    public void setGdcUserId(String gdcUserId) {
        this.gdcUserId = gdcUserId;
    }

    public String getGdcPassword() {
        return gdcPassword;
    }

    public void setGdcPassword(String gdcPassword) {
        this.gdcPassword = gdcPassword;
    }

    public String getEncAuthToken() {
        return encAuthToken;
    }

    public void setEncAuthToken(String encAuthToken) {
        this.encAuthToken = encAuthToken;
    }

    public String getDcmId() {
        return dcmId;
    }

    public void setDcmId(String dcmId) {
        this.dcmId = dcmId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getModelyear() {
        return modelyear;
    }

    public void setModelyear(String modelyear) {
        this.modelyear = modelyear;
    }

}
