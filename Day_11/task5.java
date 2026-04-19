class Shape {
}

class Circle extends Shape {
    void showCircle() {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape {
    void showRectangle() {
        System.out.println("Rectangle");
    }
}

public class task5 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.showCircle();
        r.showRectangle();
    }
}