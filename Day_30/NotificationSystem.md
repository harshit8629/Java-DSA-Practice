class Notification {
    void sendNotification() {
        System.out.println("Sending Notification...");
    }
}

class EmailNotification extends Notification {
    void sendNotification() {
        System.out.println("Sending Email Notification...");
        System.out.println("Email Sent Successfully");
    }
}

class SMSNotification extends Notification {
    void sendNotification() {
        System.out.println("Sending SMS Notification...");
        System.out.println("SMS Delivered Successfully");
    }
}

class PushNotification extends Notification {
    void sendNotification() {
        System.out.println("Sending Push Notification...");
        System.out.println("Push Notification Delivered");
    }
}

public class NotificationSystem {
    public static void main(String[] args) {

        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        Notification n3 = new PushNotification();

        n1.sendNotification();
        System.out.println();

        n2.sendNotification();
        System.out.println();

        n3.sendNotification();
    }
}