class MobilePhone {
    private String brand;
    private String password;
    private int batteryPercentage;

    public MobilePhone(String brand, String password, int batteryPercentage) {
        this.brand = brand;
        this.password = password;
        setBatteryPercentage(batteryPercentage);
    }

    public void unlockPhone(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            System.out.println("Phone Unlocked");
        } else {
            System.out.println("Incorrect Password");
        }
    }

    public void chargeBattery(int charge) {
        if (charge > 0) {
            batteryPercentage += charge;

            if (batteryPercentage > 100) {
                batteryPercentage = 100;
            }

            System.out.println("Battery Charged: " + batteryPercentage + "%");
        } else {
            System.out.println("Invalid Charge Value");
        }
    }

    public void setBatteryPercentage(int batteryPercentage) {
        if (batteryPercentage >= 0 && batteryPercentage <= 100) {
            this.batteryPercentage = batteryPercentage;
        } else {
            System.out.println("Invalid Battery Percentage");
        }
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Battery: " + batteryPercentage + "%");
    }
}

public class MobilePhoneLockSystem {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "1234", 60);

        phone.displayInfo();
        phone.unlockPhone("1234");
        phone.chargeBattery(30);
    }
}