package Workshop.Challenges;

public class Challenge2_C {

    public class ChannelSelector {
        private final ChannelFactory channelFactory;

        public ChannelSelector(ChannelFactory channelFactory) {
            this.channelFactory = channelFactory;
        }

        public NotificationChannel selectChannel(User user, MessageCategory messageCategory) {
            UserPreferences userPreferences = user.getNotificationPreferences();
            return channelFactory.create(userPreferences.getPreferredChannel(messageCategory));
        }
    }

    private class User {
        public UserPreferences getNotificationPreferences() {
            return null;
        }
    }

    private class UserPreferences {
        public NotificationChannelPreference getPreferredChannel(MessageCategory messageCategory) {
            // type = Marketing, notification, status...etc.
            // business logic here to determine the correct channel to use.
            // ideally, we'd have an object of some sort, not a magic string
            return null; // "email", "sms", "slack",
        }
    }

    private class ChannelFactory {
        public NotificationChannel create(NotificationChannelPreference preference) {
            if (preference.isType("email")) return new EmailChannel();

            if (preference.isType("sms")) return new SmsChannel();

            if (preference.isType("slack")) return new SlackChannel();

            return new NullChannel();
        }
    }

    public class EmailChannel implements NotificationChannel {
        @Override
        public void send(NotificationRequest request) {
            // email send logic here
        }

    }
    public class SmsChannel implements NotificationChannel {
        @Override
        public void send(NotificationRequest request) {
            // sms send logic here
        }
    }
    public class SlackChannel implements NotificationChannel {
        @Override
        public void send(NotificationRequest request) {
            // slack send logic here
        }
    }
    public class NullChannel implements NotificationChannel {
        @Override
        public void send(NotificationRequest request) {

        }
    }

    public interface NotificationChannel {
        void send(NotificationRequest request);
    }

    public class NotificationService {
        private final NotificationChannel channel;

        public NotificationService(NotificationChannel channel) {
            this.channel = channel;
        }

        public void sendNotification(NotificationRequest request) {
            channel.send(request);
        }
    }

    private class NotificationRequest {
    }

    private class MessageCategory {
        private String type;

        public MessageCategory(String type) {
            this.type = type;
        }

        public boolean isType(String inquryType) {
            return inquryType.equals(type);
        }
    }

    private class NotificationChannelPreference {
        private String type;

        public NotificationChannelPreference(String type) {
            this.type = type;
        }

        public boolean isType(String inquryType) {
            return inquryType.equals(type);
        }
    }

}
