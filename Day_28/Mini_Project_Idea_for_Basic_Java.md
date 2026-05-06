# Mini Project Idea for Basic Java
Student Management System

A Student Management System is one of the best beginner Java projects because it helps you practice:

Classes & Objects
Arrays / ArrayList
Loops
Conditions
Methods
Input/Output
OOP concepts
Menu-driven programs

This project is beginner-friendly and also useful for interviews and resumes.

Project Description

The project manages student records.

The user can:

Add students
View all students
Search student by roll number
Update student details
Delete student
Calculate average marks
Exit program

The project works using a menu system in the terminal.

Real World Use

Schools and colleges store information like:

Student name
Roll number
Marks
Grade

This project simulates a small version of such a system.

Concepts You Will Learn
1. Classes and Objects

You create a Student class.

Example fields:

String name;
int rollNo;
double marks;
2. Constructors

Used to initialize student data.

Example:

Student(String name, int rollNo, double marks)
3. ArrayList

Stores multiple students dynamically.

Example:

ArrayList<Student> students = new ArrayList<>();
4. Loops

Used for:

displaying records
searching
updating
5. Conditional Statements

Example:

if(student.rollNo == searchRoll)
6. Methods

Separate functionalities into methods:

addStudent()
viewStudents()
deleteStudent()
Features in Detail
1. Add Student

User enters:

Name
Roll Number
Marks

The program stores student details.

Example:

Enter Name: Harshit
Enter Roll No: 101
Enter Marks: 88
Student Added Successfully
2. View Students

Displays all student records.

Example:

Name: Harshit
Roll No: 101
Marks: 88
3. Search Student

User enters roll number.

If found:

Student Found
Name: Harshit
Marks: 88

Else:

Student Not Found
4. Update Student

Allows modifying student details.

Example:

Enter Roll Number: 101
Enter New Marks: 95
Updated Successfully
5. Delete Student

Removes student from system.

Example:

Student Deleted Successfully
6. Calculate Average Marks

Adds all marks and divides by total students.

Formula:

Average=
Number of Students
Total Marks
	​


Average=
Number of Students
Total Marks
	​


Project Structure
StudentManagementSystem
│
├── Student.java
├── StudentManagement.java
└── Main.java
Example 1 — Adding Students
Input
1. Add Student
Enter Name: Rahul
Enter Roll No: 1
Enter Marks: 85
Output
Student Added Successfully
Example 2 — Viewing Students
Output
------ Student List ------

Name: Rahul
Roll No: 1
Marks: 85

Name: Priya
Roll No: 2
Marks: 90
Example 3 — Searching Student
Input
Enter Roll No: 2
Output
Student Found
Name: Priya
Marks: 90