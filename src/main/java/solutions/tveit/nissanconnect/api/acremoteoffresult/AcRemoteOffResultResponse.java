package solutions.tveit.nissanconnect.api.acremoteoffresult;

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
 *   "timeStamp" : "2018-09-24 21:25:05",
 *   "hvacStatus" : "OFF"
 * }
 * </pre>
 */
public class AcRemoteOffResultResponse {

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
