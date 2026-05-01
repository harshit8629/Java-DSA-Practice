class BankAccount {

    private int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(2000);

        System.out.println("Balance: " + account.getBalance());
    }
}