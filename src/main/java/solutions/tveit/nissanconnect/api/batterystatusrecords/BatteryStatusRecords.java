package solutions.tveit.nissanconnect.api.batterystatusrecords;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BatteryStatusRecords {

    @SerializedName("OperationResult")
    @Expose
    private String operationResult;

    @SerializedName("OperationDateAndTime")
    @Expose
    private String operationDateAndTime;

    @SerializedName("BatteryStatus")
    @Expose
    private BatteryStatus batteryStatus;

    @SerializedName("PluginState")
    @Expose
    private String pluginState;

    @SerializedName("CruisingRangeAcOn")
    @Expose
    private String cruisingRangeAcOn;

    @SerializedName("CruisingRangeAcOff")
    @Expose
    private String cruisingRangeAcOff;

    @SerializedName("TimeRequiredToFull")
    @Expose
    private TimeRequiredToFull timeRequiredToFull;

    @SerializedName("TimeRequiredToFull200")
    @Expose
    private TimeRequiredToFull timeRequiredToFull200;

    @SerializedName("TimeRequiredToFull200_6kW")
    @Expose
    private TimeRequiredToFull timeRequiredToFull2006kW;

    @SerializedName("NotificationDateAndTime")
    @Expose
    private String notificationDateAndTime;

    @SerializedName("TargetDate")
    @Expose
    private String targetDate;

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

    public BatteryStatus getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(BatteryStatus batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public String getPluginState() {
        return pluginState;
    }

    public void setPluginState(String pluginState) {
        this.pluginState = pluginState;
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

    public String getNotificationDateAndTime() {
        return notificationDateAndTime;
    }

    public void setNotificationDateAndTime(String notificationDateAndTime) {
        this.notificationDateAndTime = notificationDateAndTime;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
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
