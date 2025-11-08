package Workshop.Challenges;

public class Challenge2_A {
    public class EmailNotificationService {
        EmailClient emailClient;
        AuditLogger auditLogger;

        public void sendWelcomeEmail(User user) {
            EmailTemplate template = getWelcomeTemplate();
            String content = template.render(user);
            emailClient.send(user.getEmail(), "Welcome!", content);
            auditLogger.log("Email sent to " + user.getEmail());
        }

        private EmailTemplate getWelcomeTemplate() {
            return null;
        }

        public void sendPasswordReset(User user) {
            // Similar email-only logic...
        }

        private class User {
            public String getEmail() {
                return null;
            }
        }

        private class EmailTemplate {
            public String render(User user) {
                return null;
            }
        }

        private class EmailClient {
            public void send(String email, String s, String content) {

            }
        }

        private class AuditLogger {
            public void log(String s) {
            }
        }
    }
}
