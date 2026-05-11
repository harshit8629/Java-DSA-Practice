abstract class VehicleService {

    abstract void serviceVehicle();

    abstract void calculateServiceCost();
}

class BikeService extends VehicleService {

    void serviceVehicle() {
        System.out.println("Bike Servicing Started");
    }

    void calculateServiceCost() {
        System.out.println("Service Cost: Rs.1500");
    }
}

class CarService extends VehicleService {

    void serviceVehicle() {
        System.out.println("Car Servicing Started");
    }

    void calculateServiceCost() {
        System.out.println("Service Cost: Rs.5000");
    }
}

class TruckService extends VehicleService {

    void serviceVehicle() {
        System.out.println("Truck Servicing Started");
    }

    void calculateServiceCost() {
        System.out.println("Service Cost: Rs.12000");
    }
}

public class VehicleServiceCenterSystem {
    public static void main(String[] args) {

        VehicleService v1 = new BikeService();
        VehicleService v2 = new CarService();
        VehicleService v3 = new TruckService();

        v1.serviceVehicle();
        v1.calculateServiceCost();

        System.out.println();

        v2.serviceVehicle();
        v2.calculateServiceCost();

        System.out.println();

        v3.serviceVehicle();
        v3.calculateServiceCost();
    }
}