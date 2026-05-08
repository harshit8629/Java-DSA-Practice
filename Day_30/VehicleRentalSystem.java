class Vehicle {
    void calculateRent(int days) {
        System.out.println("Calculating Rent...");
    }
}

class Car extends Vehicle {
    void calculateRent(int days) {
        int rent = days * 2000;
        System.out.println("Car Rent for " + days + " days: Rs." + rent);
    }
}

class Bike extends Vehicle {
    void calculateRent(int days) {
        int rent = days * 1000;
        System.out.println("Bike Rent for " + days + " days: Rs." + rent);
    }
}

class Truck extends Vehicle {
    void calculateRent(int days) {
        int rent = days * 5000;
        System.out.println("Truck Rent for " + days + " days: Rs." + rent);
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();

        v1.calculateRent(5);
        v2.calculateRent(3);
        v3.calculateRent(7);
    }
}