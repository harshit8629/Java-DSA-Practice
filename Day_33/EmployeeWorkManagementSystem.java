abstract class Employee {
    String employeeName;
    int employeeId;

    Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    abstract void work();

    abstract void calculateSalary();
}

class Developer extends Employee {

    Developer(String employeeName, int employeeId) {
        super(employeeName, employeeId);
    }

    void work() {
        System.out.println("Developer is writing code");
    }

    void calculateSalary() {
        System.out.println("Salary: Rs.70000");
    }
}

class Designer extends Employee {

    Designer(String employeeName, int employeeId) {
        super(employeeName, employeeId);
    }

    void work() {
        System.out.println("Designer is creating UI designs");
    }

    void calculateSalary() {
        System.out.println("Salary: Rs.50000");
    }
}

class Manager extends Employee {

    Manager(String employeeName, int employeeId) {
        super(employeeName, employeeId);
    }

    void work() {
        System.out.println("Manager is managing the team");
    }

    void calculateSalary() {
        System.out.println("Salary: Rs.90000");
    }
}

public class EmployeeWorkManagementSystem {
    public static void main(String[] args) {

        Employee e1 = new Developer("Rahul", 101);
        Employee e2 = new Designer("Priya", 102);
        Employee e3 = new Manager("Aman", 103);

        e1.work();
        e1.calculateSalary();

        System.out.println();

        e2.work();
        e2.calculateSalary();

        System.out.println();

        e3.work();
        e3.calculateSalary();
    }
}