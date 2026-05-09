# Encapsulation Day 3
1. Student Management System
Description

Create a student management system using encapsulation.

The Student class should have:

Private variables:
name
rollNumber
marks

Use:

Getter methods to access data
Setter methods to update data safely

Add validation:

Marks should not be negative
Marks should not exceed 100

This question helps you understand:

Data hiding
Controlled access
Validation using setters
Object-oriented programming principles
Example 1
Input:
Name = Harshit
Roll Number = 101
Marks = 85

Output:
Student Name: Harshit
Roll Number: 101
Marks: 85
Example 2
Input:
Marks = 120

Output:
Invalid Marks
Example 3
Input:
Marks = -5

Output:
Invalid Marks
2. ATM Banking System
Description

Design an ATM banking system using encapsulation.

The BankAccount class should contain:

Private variables:
accountHolder
balance
pin

Provide public methods:

deposit()
withdraw()
checkBalance()

Add conditions:

Withdrawal should fail if balance is low
PIN should remain private
Negative deposits should not be allowed

This project teaches:

Secure data handling
Encapsulation in banking systems
Access control
Business logic implementation
Example 1
Input:
Deposit = 5000

Output:
Amount Deposited Successfully
Current Balance: 5000
Example 2
Input:
Withdraw = 2000

Output:
Withdrawal Successful
Remaining Balance: 3000
Example 3
Input:
Withdraw = 10000

Output:
Insufficient Balance
3. Employee Salary Management System
Description

Build an employee salary management system.

The Employee class should contain:

Private variables:
employeeName
salary
department

Use getters and setters to:

Access employee information
Update salary safely

Add validation:

Salary cannot be negative
Department name cannot be empty

This question helps in understanding:

Encapsulation with real-world data
Controlled modification
Secure object design
Example 1
Input:
Employee Name = Rahul
Salary = 50000

Output:
Employee: Rahul
Salary: 50000
Example 2
Input:
Salary = -4000

Output:
Invalid Salary
Example 3
Input:
Department = ""

Output:
Department cannot be empty
4. Mobile Phone Lock System
Description

Create a mobile security system using encapsulation.

The MobilePhone class should have:

Private variables:
brand
password
batteryPercentage

Provide methods:

unlockPhone()
chargeBattery()
displayInfo()

Conditions:

Password should remain hidden
Battery percentage must be between 0 and 100
Unlock should only work with correct password

Concepts learned:

Data protection
Secure access
Encapsulation with validation
Example 1
Input:
Password = 1234

Output:
Phone Unlocked
Example 2
Input:
Password = 9999

Output:
Incorrect Password
Example 3
Input:
Battery = 120

Output:
Invalid Battery Percentage
5. Library Book Management System
Description

Develop a library system using encapsulation.

The Book class should contain:

Private variables:
bookTitle
authorName
price

Use methods:

setBookDetails()
displayBookDetails()

Add validation:

Price should not be negative
Book title should not be empty

This project demonstrates:

Information hiding
Validation using setters
Real-world encapsulation design
Example 1
Input:
Book = Java Programming
Price = 450

Output:
Book: Java Programming
Price: 450
Example 2
Input:
Price = -50

Output:
Invalid Book Price
Example 3
Input:
Book Title = ""

Output:
Book title cannot be empty