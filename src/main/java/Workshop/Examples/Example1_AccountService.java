package Workshop.Examples;

public class Example1_AccountService {
    public void createAccount(Account account) {
        validateAccount(account);     // Validation responsibility
        saveToDatabase(account);      // Persistence responsibility
        sendWelcomeEmail(account);    // Notification responsibility
        logAuditTrail(account);       // Logging responsibility
    }

    private void logAuditTrail(Account account) {
    }

    private void sendWelcomeEmail(Account account) {

    }

    private void saveToDatabase(Account account) {

    }

    private void validateAccount(Account account) {

    }

    private class Account {
    }
}


