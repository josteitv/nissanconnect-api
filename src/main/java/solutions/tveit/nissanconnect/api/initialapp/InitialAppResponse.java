package solutions.tveit.nissanconnect.api.initialapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Example:
 * <pre>
 * {
 *   "status" : 200,
 *   "message" : "success",
 *   "baseprm" : "uyI5Dj9g8VCOFDnBRUbr3g"
 * }
 * </pre>
 */
public class InitialAppResponse {

    @SerializedName("status")
    @Expose
    private Integer status;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("baseprm")
    @Expose
    private String baseprm;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBaseprm() {
        return baseprm;
    }

    public void setBaseprm(String baseprm) {
        this.baseprm = baseprm;
    }

}
