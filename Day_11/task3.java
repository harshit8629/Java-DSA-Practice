class Vehicle {
    void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {
}

public class task3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}