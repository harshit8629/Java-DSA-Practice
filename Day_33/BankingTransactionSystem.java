abstract class Transaction {
    double amount;

    Transaction(double amount) {
        this.amount = amount;
    }

    abstract void executeTransaction();

    abstract void showTransactionDetails();
}

class Deposit extends Transaction {

    Deposit(double amount) {
        super(amount);
    }

    void executeTransaction() {
        System.out.println("Amount Deposited Successfully");
    }

    void showTransactionDetails() {
        System.out.println("Deposited Amount: Rs." + amount);
    }
}

class Withdraw extends Transaction {

    Withdraw(double amount) {
        super(amount);
    }

    void executeTransaction() {
        System.out.println("Withdrawal Successful");
    }

    void showTransactionDetails() {
        System.out.println("Withdrawn Amount: Rs." + amount);
    }
}

class MoneyTransfer extends Transaction {

    MoneyTransfer(double amount) {
        super(amount);
    }

    void executeTransaction() {
        System.out.println("Money Transfer Completed");
    }

    void showTransactionDetails() {
        System.out.println("Transferred Amount: Rs." + amount);
    }
}

public class BankingTransactionSystem {
    public static void main(String[] args) {

        Transaction t1 = new Deposit(5000);
        Transaction t2 = new Withdraw(2000);
        Transaction t3 = new MoneyTransfer(10000);

        t1.executeTransaction();
        t1.showTransactionDetails();

        System.out.println();

        t2.executeTransaction();
        t2.showTransactionDetails();

        System.out.println();

        t3.executeTransaction();
        t3.showTransactionDetails();
    }
}