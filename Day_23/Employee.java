class Employee {

    private int salary;

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setSalary(45000);

        System.out.println("Salary: " + employee.getSalary());
    }
}