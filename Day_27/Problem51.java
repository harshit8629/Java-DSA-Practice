class Employee {

    String work() {
        return "Employee is working";
    }
}

public class Problem51 {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        System.out.println(e1.work());
        System.out.println(e2.work());
        System.out.println(e3.work());
    }
}