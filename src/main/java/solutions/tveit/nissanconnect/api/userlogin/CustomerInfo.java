package solutions.tveit.nissanconnect.api.userlogin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerInfo {

    @SerializedName("UserId")
    @Expose
    private String userId;

    @SerializedName("Language")
    @Expose
    private String language;

    @SerializedName("Timezone")
    @Expose
    private String timezone;

    @SerializedName("RegionCode")
    @Expose
    private String regionCode;

    @SerializedName("OwnerId")
    @Expose
    private String ownerId;

    @SerializedName("EMailAddress")
    @Expose
    private String eMailAddress;

    @SerializedName("Nickname")
    @Expose
    private String nickname;

    @SerializedName("Country")
    @Expose
    private String country;

    @SerializedName("VehicleImage")
    @Expose
    private String vehicleImage;

    @SerializedName("UserVehicleBoundDurationSec")
    @Expose
    private String userVehicleBoundDurationSec;

    @SerializedName("VehicleInfo")
    @Expose
    private VehicleInfo_ vehicleInfo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getEMailAddress() {
        return eMailAddress;
    }

    public void setEMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getVehicleImage() {
        return vehicleImage;
    }

    public void setVehicleImage(String vehicleImage) {
        this.vehicleImage = vehicleImage;
    }

    public String getUserVehicleBoundDurationSec() {
        return userVehicleBoundDurationSec;
    }

    public void setUserVehicleBoundDurationSec(String userVehicleBoundDurationSec) {
        this.userVehicleBoundDurationSec = userVehicleBoundDurationSec;
    }

    public VehicleInfo_ getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(VehicleInfo_ vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

}
