package solutions.tveit.nissanconnect.api.batterystatusrecords;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Example:
 * <pre>
 * {
 *   "status" : 200,
 *   "BatteryStatusRecords" : {
 *     "OperationResult" : "START",
 *     "OperationDateAndTime" : "okt. 04,2018 01:19",
 *     "BatteryStatus" : {
 *       "BatteryChargingStatus" : "NOT_CHARGING",
 *       "BatteryCapacity" : "240",
 *       "BatteryRemainingAmount" : "140",
 *       "BatteryRemainingAmountWH" : "15840",
 *       "BatteryRemainingAmountkWH" : "",
 *       "SOC" : {
 *         "Value" : "57"
 *       }
 *     },
 *     "PluginState" : "NOT_CONNECTED",
 *     "CruisingRangeAcOn" : "105000",
 *     "CruisingRangeAcOff" : "113000",
 *     "TimeRequiredToFull" : {
 *       "HourRequiredToFull" : "18",
 *       "MinutesRequiredToFull" : "30"
 *     },
 *     "TimeRequiredToFull200" : {
 *       "HourRequiredToFull" : "11",
 *       "MinutesRequiredToFull" : "30"
 *     },
 *     "TimeRequiredToFull200_6kW" : {
 *       "HourRequiredToFull" : "6",
 *       "MinutesRequiredToFull" : "0"
 *     },
 *     "NotificationDateAndTime" : "2018\/10\/03 23:19",
 *     "TargetDate" : "2018\/10\/03 23:19"
 *   }
 * }
 * </pre>
 */
public class BatteryStatusRecordsResponse {

    @SerializedName("status")
    @Expose
    private Integer status;

    @SerializedName("BatteryStatusRecords")
    @Expose
    private BatteryStatusRecords batteryStatusRecords;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BatteryStatusRecords getBatteryStatusRecords() {
        return batteryStatusRecords;
    }

    public void setBatteryStatusRecords(BatteryStatusRecords batteryStatusRecords) {
        this.batteryStatusRecords = batteryStatusRecords;
    }

}
