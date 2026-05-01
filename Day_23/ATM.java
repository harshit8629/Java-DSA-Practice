class ATM {

    private int pin;

    void changePin(int pin) {
        this.pin = pin;
        System.out.println("PIN Updated Successfully");
    }

    int showPin() {
        return pin;
    }

    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.changePin(1234);

        System.out.println("PIN: " + atm.showPin());
    }
}