class Employee {
    void calculateSalary() {
        System.out.println("Calculating Salary...");
    }
}

class FullTimeEmployee extends Employee {
    void calculateSalary() {
        int salary = 60000;
        System.out.println("Full Time Employee Salary: Rs." + salary);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked = 80;
    int ratePerHour = 200;

    void calculateSalary() {
        int salary = hoursWorked * ratePerHour;
        System.out.println("Part Time Employee Salary: Rs." + salary);
    }
}

class Freelancer extends Employee {
    int projects = 4;
    int paymentPerProject = 10000;

    void calculateSalary() {
        int salary = projects * paymentPerProject;
        System.out.println("Freelancer Salary: Rs." + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();
        Employee e3 = new Freelancer();

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}