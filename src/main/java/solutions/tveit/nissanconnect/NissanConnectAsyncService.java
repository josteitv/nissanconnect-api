package solutions.tveit.nissanconnect;

import solutions.tveit.nissanconnect.api.acremoteresult.AcRemoteResultResponse;
import solutions.tveit.nissanconnect.api.batterystatuscheckresult.BatteryStatusCheckResultResponse;
import solutions.tveit.nissanconnect.api.batterystatusrecords.BatteryStatusRecordsResponse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NissanConnectAsyncService {

    private final NissanConnectService nissanConnectService;

    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public NissanConnectAsyncService() {
        nissanConnectService = new NissanConnectService();
    }

    public NissanConnectAsyncService(String baseUrl) {
        nissanConnectService = new NissanConnectService(baseUrl);
    }

    public void login(Region region, String userId, String password) {
        // Since we're using a SingleThreadExecutor, other calls will queue up and not execute until login has finished
        executor.submit(() -> nissanConnectService.login(region, userId, password));
    }

    public Future<BatteryStatusRecordsResponse> getBatteryStatusRecords() {
        return executor.submit(nissanConnectService::getBatteryStatusRecords);
    }

    public Future<BatteryStatusCheckResultResponse> getBatteryStatus() {
        return executor.submit(nissanConnectService::getBatteryStatus);
    }

    public Future<AcRemoteResultResponse> turnAcOn() {
        return executor.submit(nissanConnectService::turnAcOn);
    }

}
