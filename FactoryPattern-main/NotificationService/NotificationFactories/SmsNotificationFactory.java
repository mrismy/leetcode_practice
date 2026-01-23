package NotificationService.NotificationFactories;

import NotificationService.Notification;
import NotificationService.NotificationFactory;
import NotificationService.NotificationType;
import NotificationService.SmsNotification.SmsNotification;

public class SmsNotificationFactory extends NotificationFactory {

    @Override
    protected Notification createNotification(NotificationType type) {
        return new SmsNotification();
    }

}
