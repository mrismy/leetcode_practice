package NotificationService.NotificationFactories;

import NotificationService.Notification;
import NotificationService.NotificationFactory;
import NotificationService.NotificationType;
import NotificationService.EmailNotification.bookedByAdminSuccess;
import NotificationService.EmailNotification.bookedByUserSuccess;
import NotificationService.EmailNotification.bookedOnBehalfSuccess;
import NotificationService.EmailNotification.bookingCancelledByAdmin;
import NotificationService.EmailNotification.bookingCancelledByUser;
import NotificationService.EmailNotification.bookingCancelledOnBehalf;

public class EmailNotificationFactory extends NotificationFactory {

    @Override
    protected Notification createNotification(NotificationType type) {
        if (type == NotificationType.bookedByAdminSuccess) {
            return new bookedByAdminSuccess();
        } else if (type == NotificationType.bookedByUserSuccess) {
            return new bookedByUserSuccess();
        } else if (type == NotificationType.bookedOnBehalfSuccess) {
            return new bookedOnBehalfSuccess();
        } else if (type == NotificationType.bookingCancelledByAdmin) {
            return new bookingCancelledByAdmin();
        } else if (type == NotificationType.bookingCancelledByUser) {
            return new bookingCancelledByUser();
        } else if (type == NotificationType.bookingCancelledOnBehalf) {
            return new bookingCancelledOnBehalf();
        } else {
            return null;
        }
    }

}
