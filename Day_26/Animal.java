class Animal {

    String sound() {
        return "Animal makes sound";
    }

    public static void main(String[] args) {

        Animal a = new Animal();

        System.out.println(a.sound());
    }
}