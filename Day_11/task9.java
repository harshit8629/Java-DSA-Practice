class Parent {
    protected int number = 50;
}

class Child extends Parent {
    void display() {
        System.out.println("Number: " + number);
    }
}

public class task9 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}