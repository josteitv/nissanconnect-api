package solutions.tveit.nissanconnect;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import solutions.tveit.nissanconnect.api.ErrorResponse;

import java.io.IOException;
import java.nio.charset.Charset;

public class ErrorResponseInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);

        if (response.code() == 200) {
            // Response buffer can only be read once, so we have to clone it
            ResponseBody responseBody = response.body();
            BufferedSource source = responseBody.source();
            source.request(Long.MAX_VALUE);
            Buffer buffer = source.buffer();
            String body = buffer.clone().readString(Charset.forName("UTF-8"));
            JsonObject jsonObject = new JsonParser().parse(body).getAsJsonObject();
            String status = jsonObject.get("status").getAsString();
            if (!"200".equals(status)) {
                ErrorResponse errorResponse = new Gson().fromJson(body, ErrorResponse.class);
                throw new NissanConnectException(errorResponse.getStatus() + " - " + errorResponse.getMessage());
            }
        }

        return response;
    }
}
