package Archive.Exception.Bank2;

public class BadCreditHistoryException extends RuntimeException {
    public BadCreditHistoryException(String message) {
        super(message);
    }
}
