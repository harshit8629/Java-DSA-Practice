class Employee {
    int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println("Employee Salary: " + salary);
    }

    int calculateBonus(int salary) {
        return salary + 2000;
    }

    int calculateBonus(int salary, int performanceBonus) {
        return salary + performanceBonus;
    }
}

class Developer extends Employee {
    Developer(int salary) {
        super(salary);
    }

    void displaySalary() {
        int totalSalary = calculateBonus(salary, 10000);
        System.out.println("Developer Total Salary: " + totalSalary);
    }
}

class Manager extends Employee {
    Manager(int salary) {
        super(salary);
    }

    void displaySalary() {
        int totalSalary = calculateBonus(salary, 20000);
        System.out.println("Manager Total Salary: " + totalSalary);
    }
}

class Intern extends Employee {
    Intern(int salary) {
        super(salary);
    }

    void displaySalary() {
        int totalSalary = calculateBonus(salary);
        System.out.println("Intern Total Salary: " + totalSalary);
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Employee e1 = new Developer(50000);
        Employee e2 = new Manager(80000);
        Employee e3 = new Intern(15000);

        e1.displaySalary();
        e2.displaySalary();
        e3.displaySalary();
    }
}