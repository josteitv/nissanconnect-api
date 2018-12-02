package solutions.tveit.nissanconnect.api.batterystatusrecords;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BatteryStatus {

    @SerializedName("BatteryChargingStatus")
    @Expose
    private String batteryChargingStatus;

    @SerializedName("BatteryCapacity")
    @Expose
    private String batteryCapacity;

    @SerializedName("BatteryRemainingAmount")
    @Expose
    private String batteryRemainingAmount;

    @SerializedName("BatteryRemainingAmountWH")
    @Expose
    private String batteryRemainingAmountWH;

    @SerializedName("BatteryRemainingAmountkWH")
    @Expose
    private String batteryRemainingAmountkWH;

    @SerializedName("SOC")
    @Expose
    private Soc soc;

    public String getBatteryChargingStatus() {
        return batteryChargingStatus;
    }

    public void setBatteryChargingStatus(String batteryChargingStatus) {
        this.batteryChargingStatus = batteryChargingStatus;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getBatteryRemainingAmount() {
        return batteryRemainingAmount;
    }

    public void setBatteryRemainingAmount(String batteryRemainingAmount) {
        this.batteryRemainingAmount = batteryRemainingAmount;
    }

    public String getBatteryRemainingAmountWH() {
        return batteryRemainingAmountWH;
    }

    public void setBatteryRemainingAmountWH(String batteryRemainingAmountWH) {
        this.batteryRemainingAmountWH = batteryRemainingAmountWH;
    }

    public String getBatteryRemainingAmountkWH() {
        return batteryRemainingAmountkWH;
    }

    public void setBatteryRemainingAmountkWH(String batteryRemainingAmountkWH) {
        this.batteryRemainingAmountkWH = batteryRemainingAmountkWH;
    }

    public Soc getSoc() {
        return soc;
    }

    public void setSoc(Soc soc) {
        this.soc = soc;
    }

}
