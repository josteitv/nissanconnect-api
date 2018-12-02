package solutions.tveit.nissanconnect.api.acremoterequest;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Example:
 * <pre>
 * {
 *   "status" : 200,
 *   "userId" : "owner@gmail.com",
 *   "vin" : "1ABCDEFG2HIJKLM3N",
 *   "resultKey" : "12345678901234567890123456789012345678901234567890"
 * }
 * </pre>
 */
public class AcRemoteRequestResponse {

    @SerializedName("status")
    @Expose
    private Integer status;

    @SerializedName("userId")
    @Expose
    private String userId;

    @SerializedName("vin")
    @Expose
    private String vin;

    @SerializedName("resultKey")
    @Expose
    private String resultKey;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getResultKey() {
        return resultKey;
    }

    public void setResultKey(String resultKey) {
        this.resultKey = resultKey;
    }

}
