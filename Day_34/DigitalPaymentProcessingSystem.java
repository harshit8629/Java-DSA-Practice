abstract class PaymentMethod {
    String paymentId;
    double amount;

    PaymentMethod(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    abstract void authenticatePayment();

    abstract void processPayment();
}

class CreditCardPayment extends PaymentMethod {

    CreditCardPayment(String paymentId, double amount) {
        super(paymentId, amount);
    }

    void authenticatePayment() {
        System.out.println("Credit Card Authentication Successful");
    }

    void processPayment() {
        System.out.println("Credit Card Payment Processed");
        System.out.println("Amount: Rs." + amount);
    }
}

class UPIPayment extends PaymentMethod {

    UPIPayment(String paymentId, double amount) {
        super(paymentId, amount);
    }

    void authenticatePayment() {
        System.out.println("UPI Verification Successful");
    }

    void processPayment() {
        System.out.println("UPI Payment Completed");
        System.out.println("Amount: Rs." + amount);
    }
}

class NetBankingPayment extends PaymentMethod {

    NetBankingPayment(String paymentId, double amount) {
        super(paymentId, amount);
    }

    void authenticatePayment() {
        System.out.println("Bank Authentication Successful");
    }

    void processPayment() {
        System.out.println("Net Banking Payment Completed");
        System.out.println("Amount: Rs." + amount);
    }
}

public class DigitalPaymentProcessingSystem {
    public static void main(String[] args) {

        PaymentMethod p1 = new CreditCardPayment("CC101", 5000);
        PaymentMethod p2 = new UPIPayment("UPI202", 1500);
        PaymentMethod p3 = new NetBankingPayment("NB303", 10000);

        p1.authenticatePayment();
        p1.processPayment();

        System.out.println();

        p2.authenticatePayment();
        p2.processPayment();

        System.out.println();

        p3.authenticatePayment();
        p3.processPayment();
    }
}