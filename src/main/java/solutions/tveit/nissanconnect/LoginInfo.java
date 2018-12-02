package solutions.tveit.nissanconnect;

class LoginInfo {
    private final String nickname;
    private final String sessionId;
    private final String vin;
    private final String dcmid;
    private final String userVehicleBoundTime;
    private final String timezone;
    private final String language;
    private final String regionCode;
    private final String emailAddress;

    LoginInfo(String nickname, String sessionId, String vin, String dcmid, String userVehicleBoundTime, String timezone, String language, String regionCode, String emailAddress) {
        this.nickname = nickname;
        this.sessionId = sessionId;
        this.vin = vin;
        this.dcmid = dcmid;
        this.userVehicleBoundTime = userVehicleBoundTime;
        this.timezone = timezone;
        this.language = language;
        this.regionCode = regionCode;
        this.emailAddress = emailAddress;
    }

    String getNickname() {
        return nickname;
    }

    String getSessionId() {
        return sessionId;
    }

    String getVin() {
        return vin;
    }

    String getDcmid() {
        return dcmid;
    }

    String getUserVehicleBoundTime() {
        return userVehicleBoundTime;
    }

    String getTimezone() {
        return timezone;
    }

    String getLanguage() {
        return language;
    }

    String getRegionCode() {
        return regionCode;
    }

    String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "nickname='" + nickname + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", vin='" + vin + '\'' +
                ", dcmid='" + dcmid + '\'' +
                ", userVehicleBoundTime='" + userVehicleBoundTime + '\'' +
                ", timezone='" + timezone + '\'' +
                ", language='" + language + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

}
