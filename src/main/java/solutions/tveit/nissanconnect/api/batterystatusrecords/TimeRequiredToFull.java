package solutions.tveit.nissanconnect.api.batterystatusrecords;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeRequiredToFull {

    @SerializedName("HourRequiredToFull")
    @Expose
    private String hourRequiredToFull;

    @SerializedName("MinutesRequiredToFull")
    @Expose
    private String minutesRequiredToFull;

    public String getHourRequiredToFull() {
        return hourRequiredToFull;
    }

    public void setHourRequiredToFull(String hourRequiredToFull) {
        this.hourRequiredToFull = hourRequiredToFull;
    }

    public String getMinutesRequiredToFull() {
        return minutesRequiredToFull;
    }

    public void setMinutesRequiredToFull(String minutesRequiredToFull) {
        this.minutesRequiredToFull = minutesRequiredToFull;
    }

}