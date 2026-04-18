class Car {
    String brand;
    int price;

    // Parameterized constructor
    Car(String b, int p) {
        brand = b;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Car c = new Car("BMW", 5000000);
        c.display();
    }
}