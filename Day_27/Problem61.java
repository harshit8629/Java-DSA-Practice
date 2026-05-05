class Notification {

    String send() {
        return "Sending notification";
    }
}

public class Problem61 {

    public static void main(String[] args) {

        Notification n1 = new Notification();
        Notification n2 = new Notification();
        Notification n3 = new Notification();

        System.out.println(n1.send());
        System.out.println(n2.send());
        System.out.println(n3.send());
    }
}