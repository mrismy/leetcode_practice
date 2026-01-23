import NotificationService.Notification;
import NotificationService.NotificationFactory;
import NotificationService.NotificationType;
import NotificationService.NotificationFactories.EmailNotificationFactory;

public class BookingPlatform {
    public static void main(String[] args) {

        NotificationFactory emailFactory = new EmailNotificationFactory();

        // When a User makes a booking
        Notification notification = emailFactory.create(NotificationType.bookedByUserSuccess);
        notification.send("Booking Successful","myself@email.com", "admin@rmail.com");
        
        // When a Admin cancel on Behalf of A user
        Notification notification2 = emailFactory.create(NotificationType.bookingCancelledOnBehalf);
        notification2.send("Booking of User cancelled by Admin", "admin@gmail.com", "user101@gmail.com");
    }
}
