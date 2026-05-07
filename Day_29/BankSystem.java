class Bank {
    double calculateInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    double calculateInterest() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double calculateInterest() {
        return 7.0;
    }
}

class ICICI extends Bank {
    double calculateInterest() {
        return 6.8;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Interest Rate: " + b1.calculateInterest() + "%");
        System.out.println("HDFC Interest Rate: " + b2.calculateInterest() + "%");
        System.out.println("ICICI Interest Rate: " + b3.calculateInterest() + "%");
    }
}