package solutions.tveit.nissanconnect.api.batterystatusrecords;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Soc {

    @SerializedName("Value")
    @Expose
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
