package solutions.tveit.nissanconnect.api.userlogin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Example:
 * <pre>
 *  {
 *   "status" : 200,
 *   "sessionId" : "12345678-1234-1234-1234-1234567890",
 *   "VehicleInfoList" : {
 *     "VehicleInfo" : [{
 *         "nickname" : "LEAF",
 *         "telematicsEnabled" : "true",
 *         "vin" : "1ABCDEFG2HIJKLM3N"
 *       }
 *     ],
 *     "vehicleInfo" : [{
 *         "nickname" : "LEAF",
 *         "telematicsEnabled" : "true",
 *         "vin" : "1ABCDEFG2HIJKLM3N",
 *         "custom_sessionid" : "ksjhfklsdjflsdfjlksdfsdfkjhsdkflhjsdkfjndsklfjsdkfljsdlkfjsdfk=="
 *       }
 *     ]
 *   },
 *   "vehicle" : {
 *     "profile" : {
 *       "vin" : "1ABCDEFG2HIJKLM3N",
 *       "gdcUserId" : "",
 *       "gdcPassword" : "",
 *       "encAuthToken" : "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ",
 *       "dcmId" : "123456789012",
 *       "nickname" : "LEAF",
 *       "modelyear" : "16"
 *     }
 *   },
 *   "EncAuthToken" : "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ",
 *   "CustomerInfo" : {
 *     "UserId" : "AB12345678",
 *     "Language" : "en-US",
 *     "Timezone" : "America\/New_York",
 *     "RegionCode" : "NNA",
 *     "OwnerId" : "1234567890",
 *     "EMailAddress" : "owner@gmail.com",
 *     "Nickname" : "LEAF",
 *     "Country" : "US",
 *     "VehicleImage" : "\/content\/language\/default\/images\/img\/ph_car.jpg",
 *     "UserVehicleBoundDurationSec" : "999971200",
 *     "VehicleInfo" : {
 *       "VIN" : "1ABCDEFG2HIJKLM3N",
 *       "DCMID" : "201212345678",
 *       "SIMID" : "12345678901234567890",
 *       "NAVIID" : "1234567890",
 *       "EncryptedNAVIID" : "1234567890ABCDEFGHIJKLMNOP",
 *       "MSN" : "123456789012345",
 *       "LastVehicleLoginTime" : "",
 *       "UserVehicleBoundTime" : "2015-08-17T14:16:32Z",
 *       "LastDCMUseTime" : ""
 *     }
 *   },
 *   "UserInfoRevisionNo" : "1"
 * }
 * </pre>
 *
 */
public class UserLoginResponse {

    @SerializedName("status")
    @Expose
    private Integer status;

    @SerializedName("sessionId")
    @Expose
    private String sessionId;

    @SerializedName("VehicleInfoList")
    @Expose
    private VehicleInfoList vehicleInfoList;

    @SerializedName("vehicle")
    @Expose
    private Vehicle vehicle;

    @SerializedName("EncAuthToken")
    @Expose
    private String encAuthToken;

    @SerializedName("CustomerInfo")
    @Expose
    private CustomerInfo customerInfo;

    @SerializedName("UserInfoRevisionNo")
    @Expose
    private String userInfoRevisionNo;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public VehicleInfoList getVehicleInfoList() {
        return vehicleInfoList;
    }

    public void setVehicleInfoList(VehicleInfoList vehicleInfoList) {
        this.vehicleInfoList = vehicleInfoList;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getEncAuthToken() {
        return encAuthToken;
    }

    public void setEncAuthToken(String encAuthToken) {
        this.encAuthToken = encAuthToken;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public String getUserInfoRevisionNo() {
        return userInfoRevisionNo;
    }

    public void setUserInfoRevisionNo(String userInfoRevisionNo) {
        this.userInfoRevisionNo = userInfoRevisionNo;
    }

}
