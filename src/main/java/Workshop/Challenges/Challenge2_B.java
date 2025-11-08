package Workshop.Challenges;

public class Challenge2_B {
    public interface NotificationChannel {
        void send(NotificationRequest request);
    }

    public class NotificationService {
        private NotificationChannel channel;

        public void sendNotification(NotificationRequest request) {
            channel.send(request);
        }
    }

    private class NotificationRequest {
    }

}
