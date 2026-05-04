class Animal1 {

    String sound() {
        return "Animal makes sound";
    }

    public static void main(String[] args) {

        Cat c = new Cat();

        System.out.println(c.sound());
    }
}

class Cat extends Animal1 {

    String sound() {
        return "Cat meows";
    }
}