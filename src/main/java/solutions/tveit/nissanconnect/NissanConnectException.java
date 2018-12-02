package solutions.tveit.nissanconnect;

public class NissanConnectException extends RuntimeException {
    public NissanConnectException(String message) {
        super(message);
    }

    public NissanConnectException(Exception e) {
        super(e);
    }

}
