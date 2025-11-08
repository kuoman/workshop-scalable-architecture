package Workshop.Examples;

public class Example2_OpenForExtensionClosedForModification_Solution {
    public interface NotificationChannel {
        void send(String message);
    }

    public class NotificationService {
        public void send(NotificationChannel channel, String message) {
            channel.send(message); // Closed for modification!
        }
    }
}
