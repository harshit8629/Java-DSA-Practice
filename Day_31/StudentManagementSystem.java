class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Harshit");
        s1.setRollNumber(101);
        s1.setMarks(85);

        s1.displayStudent();
    }
}