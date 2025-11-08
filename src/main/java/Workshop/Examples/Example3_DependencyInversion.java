package Workshop.Examples;

public class Example3_DependencyInversion {
    public class LeadService {
        private EmailSender emailSender = new EmailSender(); // Concrete dependency!

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
