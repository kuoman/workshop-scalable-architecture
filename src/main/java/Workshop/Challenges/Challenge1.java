package Workshop.Challenges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Challenge1 {
    public class AccountService {
        public void createAccount(Account account) throws SQLException {
            // Validation
            if (account.getName() == null || account.getName().isEmpty()) {
                throw new IllegalArgumentException("Account name required");
            }

            // Database persistence
            Connection conn = DriverManager.getConnection("jdbc:...");
            // SQL insert logic...

            // Email notification
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.company.com");
            // Email sending logic...

            // Audit logging
            System.out.println("Account created: " + account.getName());
        }
    }

    private class Account {
        public String getName() {
            return "Status Kuo";
        }
    }
}
