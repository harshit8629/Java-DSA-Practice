class Employee {
    private String employeeName;
    private double salary;
    private String department;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    public void setDepartment(String department) {
        if (department != null && !department.isEmpty()) {
            this.department = department;
        } else {
            System.out.println("Department cannot be empty");
        }
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class EmployeeSalaryManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setEmployeeName("Rahul");
        e1.setSalary(50000);
        e1.setDepartment("IT");

        e1.displayEmployee();
    }
}