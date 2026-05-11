abstract class Appliance {
    String applianceName;
    int powerConsumption;

    Appliance(String applianceName, int powerConsumption) {
        this.applianceName = applianceName;
        this.powerConsumption = powerConsumption;
    }

    abstract void turnOn();

    abstract void turnOff();
}

class Fan extends Appliance {

    Fan(String applianceName, int powerConsumption) {
        super(applianceName, powerConsumption);
    }

    void turnOn() {
        System.out.println("Fan is now ON");
    }

    void turnOff() {
        System.out.println("Fan is now OFF");
    }
}

class AirConditioner extends Appliance {

    AirConditioner(String applianceName, int powerConsumption) {
        super(applianceName, powerConsumption);
    }

    void turnOn() {
        System.out.println("AC Cooling Started");
    }

    void turnOff() {
        System.out.println("AC Turned OFF");
    }
}

class WashingMachine extends Appliance {

    WashingMachine(String applianceName, int powerConsumption) {
        super(applianceName, powerConsumption);
    }

    void turnOn() {
        System.out.println("Washing Started");
    }

    void turnOff() {
        System.out.println("Washing Machine Stopped");
    }
}

public class SmartHomeApplianceSystem {
    public static void main(String[] args) {

        Appliance a1 = new Fan("Fan", 70);
        Appliance a2 = new AirConditioner("AC", 1500);
        Appliance a3 = new WashingMachine("Washing Machine", 800);

        a1.turnOn();
        a1.turnOff();

        System.out.println();

        a2.turnOn();
        a2.turnOff();

        System.out.println();

        a3.turnOn();
        a3.turnOff();
    }
}