package solutions.tveit.nissanconnect;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

class FileUtils {

    static String readFileFromClasspath(String filename) {
        InputStream inputStream = FileUtils.class.getResourceAsStream(filename);
        return readFromInputStream(inputStream);
    }

    private static String readFromInputStream(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream))
                .lines().collect(Collectors.joining("\n"));
    }
}
