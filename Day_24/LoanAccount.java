class LoanAccount {

    private int loanAmount = 0;

    void takeLoan(int amount) {
        loanAmount += amount;
    }

    void payLoan(int amount) {

        if (amount <= loanAmount) {
            loanAmount -= amount;
        }
    }

    int getLoanAmount() {
        return loanAmount;
    }

    public static void main(String[] args) {

        LoanAccount loan = new LoanAccount();

        loan.takeLoan(50000);
        loan.payLoan(20000);

        System.out.println("Remaining Loan: " + loan.getLoanAmount());
    }
}