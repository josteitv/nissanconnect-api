package solutions.tveit.nissanconnect.api.batterystatuscheckresult;

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
 *   "operationResult" : "START",
 *   "timeStamp" : "2018-09-24 21:23:42",
 *   "cruisingRangeAcOn" : "134000.0",
 *   "cruisingRangeAcOff" : "138000.0",
 *   "currentChargeLevel" : "0",
 *   "chargeMode" : "NOT_CHARGING",
 *   "pluginState" : "NOT_CONNECTED",
 *   "charging" : "NO",
 *   "chargeStatus" : "CT",
 *   "batteryDegradation" : "160",
 *   "batteryCapacity" : "240",
 *   "timeRequiredToFull" : {
 *     "hours" : "",
 *     "minutes" : ""
 *   },
 *   "timeRequiredToFull200" : {
 *     "hours" : "",
 *     "minutes" : ""
 *   },
 *   "timeRequiredToFull200_6kW" : {
 *     "hours" : "",
 *     "minutes" : ""
 *   }
 * }
 * </pre>
 */
public class BatteryStatusCheckResultResponse {

    @SerializedName("status")
    @Expose
    private Integer status;

    @SerializedName("responseFlag")
    @Expose
    private String responseFlag;

    @SerializedName("operationResult")
    @Expose
    private String operationResult;

    @SerializedName("timeStamp")
    @Expose
    private String timeStamp;

    @SerializedName("cruisingRangeAcOn")
    @Expose
    private String cruisingRangeAcOn;

    @SerializedName("cruisingRangeAcOff")
    @Expose
    private String cruisingRangeAcOff;

    @SerializedName("currentChargeLevel")
    @Expose
    private String currentChargeLevel;

    @SerializedName("chargeMode")
    @Expose
    private String chargeMode;

    @SerializedName("pluginState")
    @Expose
    private String pluginState;

    @SerializedName("charging")
    @Expose
    private String charging;

    @SerializedName("chargeStatus")
    @Expose
    private String chargeStatus;

    @SerializedName("batteryDegradation")
    @Expose
    private String batteryDegradation;

    @SerializedName("batteryCapacity")
    @Expose
    private String batteryCapacity;

    @SerializedName("timeRequiredToFull")
    @Expose
    private TimeRequiredToFull timeRequiredToFull;

    @SerializedName("timeRequiredToFull200")
    @Expose
    private TimeRequiredToFull timeRequiredToFull200;

    @SerializedName("timeRequiredToFull200_6kW")
    @Expose
    private TimeRequiredToFull timeRequiredToFull2006kW;

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

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
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

    public String getCurrentChargeLevel() {
        return currentChargeLevel;
    }

    public void setCurrentChargeLevel(String currentChargeLevel) {
        this.currentChargeLevel = currentChargeLevel;
    }

    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public String getPluginState() {
        return pluginState;
    }

    public void setPluginState(String pluginState) {
        this.pluginState = pluginState;
    }

    public String getCharging() {
        return charging;
    }

    public void setCharging(String charging) {
        this.charging = charging;
    }

    public String getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public String getBatteryDegradation() {
        return batteryDegradation;
    }

    public void setBatteryDegradation(String batteryDegradation) {
        this.batteryDegradation = batteryDegradation;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public TimeRequiredToFull getTimeRequiredToFull() {
        return timeRequiredToFull;
    }

    public void setTimeRequiredToFull(TimeRequiredToFull timeRequiredToFull) {
        this.timeRequiredToFull = timeRequiredToFull;
    }

    public TimeRequiredToFull getTimeRequiredToFull200() {
        return timeRequiredToFull200;
    }

    public void setTimeRequiredToFull200(TimeRequiredToFull timeRequiredToFull200) {
        this.timeRequiredToFull200 = timeRequiredToFull200;
    }

    public TimeRequiredToFull getTimeRequiredToFull2006kW() {
        return timeRequiredToFull2006kW;
    }

    public void setTimeRequiredToFull2006kW(TimeRequiredToFull timeRequiredToFull2006kW) {
        this.timeRequiredToFull2006kW = timeRequiredToFull2006kW;
    }

}
