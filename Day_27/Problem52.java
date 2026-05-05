class Employee {

    String work() {
        return "Employee is working";
    }
}

class Developer extends Employee {

    String work() {
        return "Developer is writing code";
    }
}

public class Problem52 {

    public static void main(String[] args) {

        Developer d1 = new Developer();
        Developer d2 = new Developer();
        Developer d3 = new Developer();

        System.out.println(d1.work());
        System.out.println(d2.work());
        System.out.println(d3.work());
    }
}