class Notification {

    String send() {
        return "Sending notification";
    }
}

class SMSNotification extends Notification {

    String send() {
        return "SMS sent successfully";
    }
}

public class Problem62 {

    public static void main(String[] args) {

        SMSNotification s1 = new SMSNotification();
        SMSNotification s2 = new SMSNotification();
        SMSNotification s3 = new SMSNotification();

        System.out.println(s1.send());
        System.out.println(s2.send());
        System.out.println(s3.send());
    }
}