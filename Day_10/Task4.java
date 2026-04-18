class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Person p1 = new Person("Harshit", 20);
        Person p2 = new Person(p1);

        p2.display();
    }
}