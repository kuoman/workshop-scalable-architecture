package Workshop.Examples;

public class Example1_AccountService_Solution {
    private AccountValidator validator;
    private AccountRepository repository;
    private NotificationService notificationService;
    private AuditLogger auditLogger;

    public void createAccount(Account account) {
        validator.validate(account);
        repository.save(account);
        notificationService.sendWelcomeEmail(account);
        auditLogger.logCreation(account);
    }

    private class Account {
    }

    private class AccountValidator {
        public void validate(Account account) {
        }
    }

    private class AccountRepository {
        public void save(Account account) {
        }
    }

    private class NotificationService {
        public void sendWelcomeEmail(Account account) {
        }
    }

    private class AuditLogger {
        public void logCreation(Account account) {
        }
    }
}
