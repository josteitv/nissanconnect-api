package solutions.tveit.nissanconnect.api.userlogin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class VehicleInfo {

        @SerializedName("nickname")
        @Expose
        private String nickname;

        @SerializedName("telematicsEnabled")
        @Expose
        private String telematicsEnabled;

        @SerializedName("vin")
        @Expose
        private String vin;

        @SerializedName("custom_sessionid")
        @Expose
        private String customSessionid;

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getTelematicsEnabled() {
            return telematicsEnabled;
        }

        public void setTelematicsEnabled(String telematicsEnabled) {
            this.telematicsEnabled = telematicsEnabled;
        }

        public String getVin() {
            return vin;
        }

        public void setVin(String vin) {
            this.vin = vin;
        }

        public String getCustomSessionid() {
            return customSessionid;
        }

        public void setCustomSessionid(String customSessionid) {
            this.customSessionid = customSessionid;
        }

    }
