package solutions.tveit.nissanconnect;

import java.io.IOException;

@FunctionalInterface
public interface PollFunction<T> {
    T getResult() throws IOException;
}
