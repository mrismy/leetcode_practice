package NotificationService.NotificationFactories;

import NotificationService.Notification;
import NotificationService.NotificationFactory;
import NotificationService.NotificationType;
import NotificationService.PushNotification.PushNotification;

public class PushNotificationFactory extends NotificationFactory {

    @Override
    protected Notification createNotification(NotificationType type) {
        return new PushNotification();
    }

}
