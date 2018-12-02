package solutions.tveit.nissanconnect.api.acremoteresult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Examples:
 * <pre>
 * {
 *   "status" : 200,
 *   "responseFlag" : "0"
 * }
 * </pre>
 *
 * <pre>
 * {
 *   "status" : 200,
 *   "responseFlag" : "1",
 *   "operationResult" : "START_BATTERY",
 *   "acContinueTime" : "900",
 *   "cruisingRangeAcOn" : "127872.0",
 *   "cruisingRangeAcOff" : "131424.0",
 *   "timeStamp" : "2018-09-24 21:23:18",
 *   "hvacStatus" : "ON"
 * }
 * </pre>
 */
public class AcRemoteResultResponse {

    @SerializedName("status")
    @Expose
    private Integer status;

    @SerializedName("responseFlag")
    @Expose
    private String responseFlag;

    @SerializedName("operationResult")
    @Expose
    private String operationResult;

    @SerializedName("acContinueTime")
    @Expose
    private String acContinueTime;

    @SerializedName("cruisingRangeAcOn")
    @Expose
    private String cruisingRangeAcOn;

    @SerializedName("cruisingRangeAcOff")
    @Expose
    private String cruisingRangeAcOff;

    @SerializedName("timeStamp")
    @Expose
    private String timeStamp;

    @SerializedName("hvacStatus")
    @Expose
    private String hvacStatus;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getResponseFlag() {
        return responseFlag;
    }

    public void setResponseFlag(String responseFlag) {
        this.responseFlag = responseFlag;
    }

    public String getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(String operationResult) {
        this.operationResult = operationResult;
    }

    public String getAcContinueTime() {
        return acContinueTime;
    }

    public void setAcContinueTime(String acContinueTime) {
        this.acContinueTime = acContinueTime;
    }

    public String getCruisingRangeAcOn() {
        return cruisingRangeAcOn;
    }

    public void setCruisingRangeAcOn(String cruisingRangeAcOn) {
        this.cruisingRangeAcOn = cruisingRangeAcOn;
    }

    public String getCruisingRangeAcOff() {
        return cruisingRangeAcOff;
    }

    public void setCruisingRangeAcOff(String cruisingRangeAcOff) {
        this.cruisingRangeAcOff = cruisingRangeAcOff;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getHvacStatus() {
        return hvacStatus;
    }

    public void setHvacStatus(String hvacStatus) {
        this.hvacStatus = hvacStatus;
    }


}
