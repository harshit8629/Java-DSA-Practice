class Wallet {

    private int balance = 0;

    void addMoney(int amount) {
        balance += amount;
    }

    void spendMoney(int amount) {

        if (amount <= balance) {
            balance -= amount;
        }
    }

    int checkBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Wallet wallet = new Wallet();

        wallet.addMoney(3000);
        wallet.spendMoney(1000);

        System.out.println("Balance: " + wallet.checkBalance());
    }
}