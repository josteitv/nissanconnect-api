package solutions.tveit.nissanconnect;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class NissanConnectServiceTest {

    private MockWebServer server;

    private NissanConnectService nissanConnectService;

    @Before
    public void setUp() throws Exception {
        server = new MockWebServer();
        server.start();

        String url = server.url("/").toString();
        nissanConnectService = new NissanConnectService(url);
    }

    @After
    public void tearDown() throws Exception {
        server.shutdown();
    }

    @Test
    public void login() throws InterruptedException {
        return200("/InitialAppResponse.json");
        return200("/UserLoginResponse.json");

        nissanConnectService.login(Region.EUROPE, "userId", "password");

        assertPostRequest("/InitialAppRequest.txt");
        assertPostRequest("/UserLoginRequest.txt");
    }

    @Test
    public void turnAcOn() throws InterruptedException {
        return200("/InitialAppResponse.json");
        return200("/UserLoginResponse.json");
        return200("/AcRemoteRequestResponse.json");
        return200("/AcRemoteResultResponse1.json");
        return200("/AcRemoteResultResponse2.json");

        nissanConnectService.login(Region.EUROPE, "userId", "password");
        nissanConnectService.turnAcOn();

        assertPostRequest("/InitialAppRequest.txt");
        assertPostRequest("/UserLoginRequest.txt");
        assertPostRequest("/AcRemoteRequest.txt");
        assertPostRequest("/AcRemoteResultRequest.txt");
        assertPostRequest("/AcRemoteResultRequest.txt");
    }


    private void assertPostRequest(String fileName) throws InterruptedException {
        RecordedRequest recordedRequest = server.takeRequest(10, TimeUnit.SECONDS);
        String expectedRequest = FileUtils.readFileFromClasspath(fileName);

        assertEquals("POST", recordedRequest.getMethod());
        assertEquals(expectedRequest, recordedRequest.getBody().readUtf8());
    }

    private void return200(String fileName) {
        server.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody(FileUtils.readFileFromClasspath(fileName)));
    }
}