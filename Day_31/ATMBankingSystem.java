class BankAccount {
    private String accountHolder;
    private double balance;
    private int pin;

    public BankAccount(String accountHolder, double balance, int pin) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully");
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount, int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
    }

    public void checkBalance(int enteredPin) {
        if (enteredPin == pin) {
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Incorrect PIN");
        }
    }
}

public class ATMBankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Harshit", 5000, 1234);

        account.deposit(2000);
        account.withdraw(3000, 1234);
        account.checkBalance(1234);
    }
}