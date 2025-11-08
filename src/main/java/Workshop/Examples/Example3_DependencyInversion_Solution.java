package Workshop.Examples;

public class Example3_DependencyInversion_Solution {
    public class LeadService {
        public LeadService() {
            this(new EmailSender());
        }

        public LeadService(EmailSender emailSender){
            this.emailSender = emailSender;
        }

        private EmailSender emailSender; 

        public void processLead(Lead lead) {
            // processing logic
            emailSender.send("New lead processed");
        }

        private class Lead {
        }
    }

    private class EmailSender {
        public void send(String newLeadProcessed) {
        }
    }
}
