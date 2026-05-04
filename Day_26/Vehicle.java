class Vehicle {

    String start() {
        return "Vehicle started";
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        System.out.println(v.start());
    }
}