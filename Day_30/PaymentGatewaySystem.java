class Payment {
    void processPayment(double amount) {
        System.out.println("Processing Payment...");
    }
}

class CreditCardPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of Rs." + amount);
        System.out.println("Transaction Successful");
    }
}

class UPIPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing UPI Payment of Rs." + amount);
        System.out.println("Transaction Successful");
    }
}

class PayPalPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of Rs." + amount);
        System.out.println("Transaction Successful");
    }
}

public class PaymentGatewaySystem {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new PayPalPayment();

        p1.processPayment(5000);
        System.out.println();

        p2.processPayment(1500);
        System.out.println();

        p3.processPayment(8000);
    }
}