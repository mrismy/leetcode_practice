package NotificationService;

public abstract class NotificationFactory {

    public Notification create(NotificationType type) {
        Notification notification = createNotification(type);
        return notification;
    }

    protected abstract Notification createNotification(NotificationType type);
}
