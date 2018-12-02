package solutions.tveit.nissanconnect.api.remoteacrecords;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Examples:
 * <pre>
 * {
 *   "status" : 200,
 *   "RemoteACRecords" : []
 * }
 * </pre>
 *
 * <pre>
 *  {
 *   "status" : 200,
 *   "RemoteACRecords" : {
 *     "OperationResult" : "START_BATTERY",
 *     "OperationDateAndTime" : "2018\/09\/24 21:22",
 *     "RemoteACOperation" : "START",
 *     "ACStartStopDateAndTime" : "sep. 24,2018 23:23",
 *     "CruisingRangeAcOn" : "127872",
 *     "CruisingRangeAcOff" : "131424",
 *     "ACStartStopURL" : "",
 *     "PluginState" : "NOT_CONNECTED",
 *     "ACDurationBatterySec" : "900",
 *     "ACDurationPluggedSec" : "7200",
 *     "PreAC_unit" : "C",
 *     "PreAC_temp" : "22"
 *   }
 * }
 * </pre>
 */
public class RemoteACRecordsResponse {

    @SerializedName("status")
    @Expose
    private Integer status;

    @SerializedName("RemoteACRecords")
    @Expose
    private RemoteACRecords remoteACRecords;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public RemoteACRecords getRemoteACRecords() {
        return remoteACRecords;
    }

    public void setRemoteACRecords(RemoteACRecords remoteACRecords) {
        this.remoteACRecords = remoteACRecords;
    }
}