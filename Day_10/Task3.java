class Rectangle {
    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 4);

        System.out.println("Area1: " + r1.area());
        System.out.println("Area2: " + r2.area());
    }
}