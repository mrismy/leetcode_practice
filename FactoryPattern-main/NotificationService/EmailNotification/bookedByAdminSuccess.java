
package NotificationService.EmailNotification;

import NotificationService.Notification;

public class bookedByAdminSuccess implements Notification {
    String message;
    String sender;
    String recipient;

    @Override
    public void send(String message, String sender, String recipient) {
        this.message = message;
        this.sender = sender;
        this.recipient = recipient;
        System.out.println("Booked By Admin");
        prepare();
        sendMessage();
    }

    private void prepare() {
        System.out.println("    Formatting the message...");
        System.out.println("    msg from: " + sender);
        System.out.println("    msg: " + message);
        System.out.println("    Preparing the Email Model");
    }

    private void sendMessage() {
        System.out.println("    Message sent to: " + recipient);
    }
}