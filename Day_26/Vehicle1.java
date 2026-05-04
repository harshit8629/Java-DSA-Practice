class Vehicle1 {

    String start() {
        return "Vehicle started";
    }

    public static void main(String[] args) {

        Bike b = new Bike();

        System.out.println(b.start());
    }
}

class Bike extends Vehicle1 {

    String start() {
        return "Bike started with self-start";
    }
}