class Payment {

    String pay() {
        return "Processing payment";
    }
}

class CardPayment extends Payment {

    String pay() {
        return "Payment made using card";
    }
}

public class Problem42 {

    public static void main(String[] args) {

        CardPayment cp1 = new CardPayment();
        CardPayment cp2 = new CardPayment();
        CardPayment cp3 = new CardPayment();

        System.out.println(cp1.pay());
        System.out.println(cp2.pay());
        System.out.println(cp3.pay());
    }
}