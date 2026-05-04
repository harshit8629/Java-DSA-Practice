class Shape {

    String area() {
        return "Area not defined";
    }

    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Shape();
        Shape s3 = new Shape();

        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
    }
}