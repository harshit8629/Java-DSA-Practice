class Shape1 {

    double area() {
        return 0;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(5);

        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c3.area());
    }
}

class Circle extends Shape1 {

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}