package NotificationService;

public interface Notification {

    public abstract void send(String message, String sender, String recipient);
}