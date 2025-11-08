package Workshop.Examples;

public class Example2_OpenForExtensionClosedForModification {
    public void sendNotification(String type, String message) {
        if (type.equals("EMAIL")) {
            // send email
        } else if (type.equals("SMS")) {
            // send SMS
        } else if (type.equals("SLACK")) { // New requirement!
            // Oh no, modifying existing code!
        }
    }
}
