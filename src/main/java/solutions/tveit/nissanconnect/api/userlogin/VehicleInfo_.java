package solutions.tveit.nissanconnect.api.userlogin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VehicleInfo_ {

    @SerializedName("VIN")
    @Expose
    private String vIN;

    @SerializedName("DCMID")
    @Expose
    private String dCMID;

    @SerializedName("SIMID")
    @Expose
    private String sIMID;

    @SerializedName("NAVIID")
    @Expose
    private String nAVIID;

    @SerializedName("EncryptedNAVIID")
    @Expose
    private String encryptedNAVIID;

    @SerializedName("MSN")
    @Expose
    private String mSN;

    @SerializedName("LastVehicleLoginTime")
    @Expose
    private String lastVehicleLoginTime;

    @SerializedName("UserVehicleBoundTime")
    @Expose
    private String userVehicleBoundTime;

    @SerializedName("LastDCMUseTime")
    @Expose
    private String lastDCMUseTime;

    public String getVIN() {
        return vIN;
    }

    public void setVIN(String vIN) {
        this.vIN = vIN;
    }

    public String getDCMID() {
        return dCMID;
    }

    public void setDCMID(String dCMID) {
        this.dCMID = dCMID;
    }

    public String getSIMID() {
        return sIMID;
    }

    public void setSIMID(String sIMID) {
        this.sIMID = sIMID;
    }

    public String getNAVIID() {
        return nAVIID;
    }

    public void setNAVIID(String nAVIID) {
        this.nAVIID = nAVIID;
    }

    public String getEncryptedNAVIID() {
        return encryptedNAVIID;
    }

    public void setEncryptedNAVIID(String encryptedNAVIID) {
        this.encryptedNAVIID = encryptedNAVIID;
    }

    public String getMSN() {
        return mSN;
    }

    public void setMSN(String mSN) {
        this.mSN = mSN;
    }

    public String getLastVehicleLoginTime() {
        return lastVehicleLoginTime;
    }

    public void setLastVehicleLoginTime(String lastVehicleLoginTime) {
        this.lastVehicleLoginTime = lastVehicleLoginTime;
    }

    public String getUserVehicleBoundTime() {
        return userVehicleBoundTime;
    }

    public void setUserVehicleBoundTime(String userVehicleBoundTime) {
        this.userVehicleBoundTime = userVehicleBoundTime;
    }

    public String getLastDCMUseTime() {
        return lastDCMUseTime;
    }

    public void setLastDCMUseTime(String lastDCMUseTime) {
        this.lastDCMUseTime = lastDCMUseTime;
    }

}
