package solutions.tveit.nissanconnect.api.batterystatuscheckresult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class TimeRequiredToFull {

        @SerializedName("hours")
        @Expose
        private String hours;

        @SerializedName("minutes")
        @Expose
        private String minutes;

        public String getHours() {
            return hours;
        }

        public void setHours(String hours) {
            this.hours = hours;
        }

        public String getMinutes() {
            return minutes;
        }

        public void setMinutes(String minutes) {
            this.minutes = minutes;
        }

    }
