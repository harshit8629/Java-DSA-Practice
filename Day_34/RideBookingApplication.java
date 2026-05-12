abstract class RideService {
    String customerName;
    double distance;

    RideService(String customerName, double distance) {
        this.customerName = customerName;
        this.distance = distance;
    }

    abstract void calculateFare();

    abstract void bookRide();
}

class BikeRide extends RideService {

    BikeRide(String customerName, double distance) {
        super(customerName, distance);
    }

    void calculateFare() {
        double fare = distance * 10;
        System.out.println("Fare: Rs." + fare);
    }

    void bookRide() {
        System.out.println("Bike Ride Booked");
    }
}

class CabRide extends RideService {

    CabRide(String customerName, double distance) {
        super(customerName, distance);
    }

    void calculateFare() {
        double fare = distance * 25;
        System.out.println("Fare: Rs." + fare);
    }

    void bookRide() {
        System.out.println("Cab Ride Booked");
    }
}

class AutoRide extends RideService {

    AutoRide(String customerName, double distance) {
        super(customerName, distance);
    }

    void calculateFare() {
        double fare = distance * 15;
        System.out.println("Fare: Rs." + fare);
    }

    void bookRide() {
        System.out.println("Auto Ride Booked");
    }
}

public class RideBookingApplication {
    public static void main(String[] args) {

        RideService r1 = new BikeRide("Harshit", 10);
        RideService r2 = new CabRide("Rahul", 10);
        RideService r3 = new AutoRide("Aman", 10);

        r1.bookRide();
        r1.calculateFare();

        System.out.println();

        r2.bookRide();
        r2.calculateFare();

        System.out.println();

        r3.bookRide();
        r3.calculateFare();
    }
}