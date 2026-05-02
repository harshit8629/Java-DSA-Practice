class ShoppingCart {

    private int totalAmount = 0;

    void addItem(int price) {
        totalAmount += price;
    }

    void removeItem(int price) {
        if (price <= totalAmount) {
            totalAmount -= price;
        }
    }

    int getTotalAmount() {
        return totalAmount;
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(2000);
        cart.addItem(1500);
        cart.removeItem(1000);

        System.out.println("Total Amount: " + cart.getTotalAmount());
    }
}