package solutions.tveit.nissanconnect.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import solutions.tveit.nissanconnect.api.acremoteoffrequest.AcRemoteOffRequestResponse;
import solutions.tveit.nissanconnect.api.acremoteoffresult.AcRemoteOffResultResponse;
import solutions.tveit.nissanconnect.api.acremoterequest.AcRemoteRequestResponse;
import solutions.tveit.nissanconnect.api.acremoteresult.AcRemoteResultResponse;
import solutions.tveit.nissanconnect.api.batterystatuscheck.BatteryStatusCheckResponse;
import solutions.tveit.nissanconnect.api.batterystatuscheckresult.BatteryStatusCheckResultResponse;
import solutions.tveit.nissanconnect.api.batterystatusrecords.BatteryStatusRecordsResponse;
import solutions.tveit.nissanconnect.api.initialapp.InitialAppResponse;
import solutions.tveit.nissanconnect.api.userlogin.UserLoginResponse;

public interface NissanConnectApi {

    @FormUrlEncoded
    @POST("InitialApp.php")
    Call<InitialAppResponse> initialApp(@Field("RegionCode") String regionCode, @Field("lg") String language, @Field("initial_app_strings") String initialAppStrings);

    @FormUrlEncoded
    @POST("UserLoginRequest.php")
    Call<UserLoginResponse> userLoginRequest(@Field("RegionCode") String regionCode, @Field("lg") String language, @Field("initial_app_strings") String initialAppStrings, @Field("UserId") String userId, @Field("Password") String encryptedPassword);

    @FormUrlEncoded
    @POST("BatteryStatusRecordsRequest.php")
    Call<BatteryStatusRecordsResponse> batteryStatusRecordsRequest(@Field("RegionCode") String regionCode, @Field("lg") String language, @Field("custom_sessionid") String customSessionId, @Field("DCMID") String dcmId, @Field("tz") String tz, @Field("VIN") String vin, @Field("TimeFrom") String timeFrom);

    @FormUrlEncoded
    @POST("BatteryStatusCheckRequest.php")
    Call<BatteryStatusCheckResponse> batteryStatusCheckRequest(@Field("RegionCode") String regionCode, @Field("lg") String language, @Field("custom_sessionid") String customSessionId, @Field("DCMID") String dcmId, @Field("tz") String tz, @Field("VIN") String vin, @Field("UserId") String userId);

    @FormUrlEncoded
    @POST("BatteryStatusCheckResultRequest.php")
    Call<BatteryStatusCheckResultResponse> batteryStatusCheckResultRequest(@Field("RegionCode") String regionCode, @Field("lg") String language, @Field("custom_sessionid") String customSessionId, @Field("DCMID") String dcmId, @Field("tz") String tz, @Field("VIN") String vin, @Field("UserId") String userId, @Field("resultKey") String resultKey);

    @FormUrlEncoded
    @POST("ACRemoteRequest.php")
    Call<AcRemoteRequestResponse> acRemoteRequest(@Field("RegionCode") String regionCode, @Field("lg") String language, @Field("custom_sessionid") String customSessionId, @Field("DCMID") String dcmId, @Field("tz") String tz, @Field("VIN") String vin, @Field("UserId") String userId);

    @FormUrlEncoded
    @POST("ACRemoteResult.php")
    Call<AcRemoteResultResponse> acRemoteResult(@Field("RegionCode") String regionCode, @Field("lg") String language, @Field("custom_sessionid") String customSessionId, @Field("DCMID") String dcmId, @Field("tz") String tz, @Field("VIN") String vin, @Field("UserId") String userId, @Field("resultKey") String resultKey);

    @FormUrlEncoded
    @POST("ACRemoteOffRequest.php")
    Call<AcRemoteOffRequestResponse> acRemoteOffRequest(@Field("RegionCode") String regionCode, @Field("lg") String language, @Field("custom_sessionid") String customSessionId, @Field("DCMID") String dcmId, @Field("tz") String tz, @Field("VIN") String vin, @Field("UserId") String userId);

    @FormUrlEncoded
    @POST("ACRemoteOffResult.php")
    Call<AcRemoteOffResultResponse> acRemoteOffResult(@Field("RegionCode") String regionCode, @Field("lg") String language, @Field("custom_sessionid") String customSessionId, @Field("DCMID") String dcmId, @Field("tz") String tz, @Field("VIN") String vin, @Field("UserId") String userId, @Field("resultKey") String resultKey);

    @FormUrlEncoded
    @POST("RemoteACRecordsRequest.php")
    Call<AcRemoteRequestResponse> remoteACRecordsRequest(@Field("RegionCode") String regionCode, @Field("lg") String language, @Field("custom_sessionid") String customSessionId, @Field("DCMID") String dcmId, @Field("tz") String tz, @Field("VIN") String vin, @Field("UserId") String userId);

}
