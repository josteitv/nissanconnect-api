package solutions.tveit.nissanconnect.api.remoteacrecords;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RemoteACRecords {

    @SerializedName("OperationResult")
    @Expose
    private String operationResult;

    @SerializedName("OperationDateAndTime")
    @Expose
    private String operationDateAndTime;

    @SerializedName("RemoteACOperation")
    @Expose
    private String remoteACOperation;

    @SerializedName("ACStartStopDateAndTime")
    @Expose
    private String aCStartStopDateAndTime;

    @SerializedName("CruisingRangeAcOn")
    @Expose
    private String cruisingRangeAcOn;

    @SerializedName("CruisingRangeAcOff")
    @Expose
    private String cruisingRangeAcOff;

    @SerializedName("ACStartStopURL")
    @Expose
    private String aCStartStopURL;

    @SerializedName("PluginState")
    @Expose
    private String pluginState;

    @SerializedName("ACDurationBatterySec")
    @Expose
    private String aCDurationBatterySec;

    @SerializedName("ACDurationPluggedSec")
    @Expose
    private String aCDurationPluggedSec;

    @SerializedName("PreAC_unit")
    @Expose
    private String preACUnit;

    @SerializedName("PreAC_temp")
    @Expose
    private String preACTemp;

    public String getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(String operationResult) {
        this.operationResult = operationResult;
    }

    public String getOperationDateAndTime() {
        return operationDateAndTime;
    }

    public void setOperationDateAndTime(String operationDateAndTime) {
        this.operationDateAndTime = operationDateAndTime;
    }

    public String getRemoteACOperation() {
        return remoteACOperation;
    }

    public void setRemoteACOperation(String remoteACOperation) {
        this.remoteACOperation = remoteACOperation;
    }

    public String getACStartStopDateAndTime() {
        return aCStartStopDateAndTime;
    }

    public void setACStartStopDateAndTime(String aCStartStopDateAndTime) {
        this.aCStartStopDateAndTime = aCStartStopDateAndTime;
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

    public String getACStartStopURL() {
        return aCStartStopURL;
    }

    public void setACStartStopURL(String aCStartStopURL) {
        this.aCStartStopURL = aCStartStopURL;
    }

    public String getPluginState() {
        return pluginState;
    }

    public void setPluginState(String pluginState) {
        this.pluginState = pluginState;
    }

    public String getACDurationBatterySec() {
        return aCDurationBatterySec;
    }

    public void setACDurationBatterySec(String aCDurationBatterySec) {
        this.aCDurationBatterySec = aCDurationBatterySec;
    }

    public String getACDurationPluggedSec() {
        return aCDurationPluggedSec;
    }

    public void setACDurationPluggedSec(String aCDurationPluggedSec) {
        this.aCDurationPluggedSec = aCDurationPluggedSec;
    }

    public String getPreACUnit() {
        return preACUnit;
    }

    public void setPreACUnit(String preACUnit) {
        this.preACUnit = preACUnit;
    }

    public String getPreACTemp() {
        return preACTemp;
    }

    public void setPreACTemp(String preACTemp) {
        this.preACTemp = preACTemp;
    }

}