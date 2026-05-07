class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow moos");
    }
}

public class AnimalSoundSystem {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}