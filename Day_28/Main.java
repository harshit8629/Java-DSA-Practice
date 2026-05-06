import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Calculate Average Marks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    operations.addStudent();
                    break;

                case 2:
                    operations.viewAllStudents();
                    break;

                case 3:
                    operations.searchStudent();
                    break;

                case 4:
                    operations.updateStudent();
                    break;

                case 5:
                    operations.deleteStudent();
                    break;

                case 6:
                    operations.calculateAverageMarks();
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}