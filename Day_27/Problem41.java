class Payment {

    String pay() {
        return "Processing payment";
    }
}

public class Problem41 {

    public static void main(String[] args) {

        Payment p1 = new Payment();
        Payment p2 = new Payment();
        Payment p3 = new Payment();

        System.out.println(p1.pay());
        System.out.println(p2.pay());
        System.out.println(p3.pay());
    }
}