class ElectricityBill {

    private int units = 0;

    void addUnits(int unit) {
        units += unit;
    }

    int getBill() {
        return units * 8;
    }

    public static void main(String[] args) {

        ElectricityBill bill = new ElectricityBill();

        bill.addUnits(120);

        System.out.println("Total Bill: " + bill.getBill());
    }
}