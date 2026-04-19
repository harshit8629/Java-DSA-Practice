class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class task8
{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}