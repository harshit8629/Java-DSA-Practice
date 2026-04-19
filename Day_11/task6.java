class Employee {
    Employee() {
        System.out.println("Employee Created");
    }
}

class Manager extends Employee {
    Manager() {
        System.out.println("Manager Created");
    }
}

public class task6 {
    public static void main(String[] args) {
        Manager m = new Manager();
    }
}