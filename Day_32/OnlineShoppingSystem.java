class Product {
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class Electronics extends Product {
    int warranty;

    Electronics(String productName, double price, int quantity, int warranty) {
        super(productName, price, quantity);
        this.warranty = warranty;
    }

    void calculateDiscount() {
        double discountedPrice = price - 5000;
        System.out.println("Electronics Discounted Price = " + discountedPrice);
    }
}

class Clothing extends Product {
    String size;

    Clothing(String productName, double price, int quantity, String size) {
        super(productName, price, quantity);
        this.size = size;
    }

    void calculateDiscount() {
        double discountedPrice = price - 200;
        System.out.println("Clothing Discounted Price = " + discountedPrice);
    }
}

class Food extends Product {
    String expiryDate;

    Food(String productName, double price, int quantity, String expiryDate) {
        super(productName, price, quantity);
        this.expiryDate = expiryDate;
    }

    void calculateDiscount() {
        double discountedPrice = price - 50;
        System.out.println("Food Discounted Price = " + discountedPrice);
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {

        Electronics e1 = new Electronics("Laptop", 70000, 2, 2);
        Clothing c1 = new Clothing("T-Shirt", 2000, 5, "L");
        Food f1 = new Food("Pizza", 500, 3, "12-05-2026");

        e1.displayProduct();
        e1.calculateDiscount();

        System.out.println();

        c1.displayProduct();
        c1.calculateDiscount();

        System.out.println();

        f1.displayProduct();
        f1.calculateDiscount();
    }
}