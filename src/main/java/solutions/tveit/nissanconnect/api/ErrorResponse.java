package solutions.tveit.nissanconnect.api;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Example:
 * <pre>
 * {
 * "status" : 404,
 * "message" : "INVALID PARAMS"
 * }
 * </pre>
 */
public class ErrorResponse {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("message")
    @Expose
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
