# Nissan Connect API

A Java library for the Nissan Connect API (also known as Carwings).
The API is used to get information and remotely control your Nissan Leaf.

## Installation

**Artifact is not yet deployed to central maven repository**

Add the following dependency to you pom.xml.
```xml
<dependency>
    <groupId>solutions.tveit.nissanconnect</groupId>
    <artifactId>nissanconnect-api</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

```java
public class Main {
    
    public static void main(String[] args) throws Exception {        
        // Create async service
        NissanConnectAsyncService service = new NissanConnectAsyncService();
        
        // Log in
        String userId = "owner@example.com";
        String password = "MySecretPassword123!";
        service.login(Region.EUROPE, userId, password);
        
        // Force update of battery status from car (this will take some time)
        Future<BatteryStatusCheckResultResponse> batteryStatus = service.getBatteryStatus();
        BatteryStatusCheckResultResponse batteryStatusCheckResultResponse = batteryStatus.get();
        
        // Get state of charge (SOC) from server
        Future<BatteryStatusRecordsResponse> batteryStatusRecords = service.getBatteryStatusRecords();
        BatteryStatusRecordsResponse batteryStatusRecordsResponse = batteryStatusRecords.get();
        String soc = batteryStatusRecordsResponse.getBatteryStatusRecords().getBatteryStatus().getSoc().getValue();
        System.out.println("soc: " + soc);
        
        // Turn on air condition
        service.turnAcOn();
    }
}
```

## References

- Protocol description: http://virantha.com/2016/04/07/updated-reverse-engineering-nissan-connect-ev-protocol/
- JavaScript API: https://github.com/philliphoff/carwings2
- Python API: https://github.com/jdhorne/pycarwings2

