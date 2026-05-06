import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperations {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        if (findStudentByRollNo(rollNo) != null) {
            System.out.println("Student with this roll number already exists.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student student = new Student(rollNo, name, marks);
        students.add(student);

        System.out.println("Student added successfully.");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n----- Student List -----");
        for (Student student : students) {
            student.displayStudent();
        }
    }

    public void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int rollNo = sc.nextInt();

        Student student = findStudentByRollNo(rollNo);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Student found:");
            student.displayStudent();
        }
    }

    public void updateStudent() {
        System.out.print("Enter Roll No to update: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        Student student = findStudentByRollNo(rollNo);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter new name: ");
        String newName = sc.nextLine();

        System.out.print("Enter new marks: ");
        double newMarks = sc.nextDouble();

        student.setName(newName);
        student.setMarks(newMarks);

        System.out.println("Student updated successfully.");
    }

    public void deleteStudent() {
        System.out.print("Enter Roll No to delete: ");
        int rollNo = sc.nextInt();

        Student student = findStudentByRollNo(rollNo);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        students.remove(student);
        System.out.println("Student deleted successfully.");
    }

    public void calculateAverageMarks() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getMarks();
        }

        double average = total / students.size();

        System.out.println("Average Marks: " + average);
    }

    private Student findStudentByRollNo(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                return student;
            }
        }
        return null;
    }
}