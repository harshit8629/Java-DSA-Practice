# Java Polymorphism Practice Questions
1. Banking System Interest Calculator
Description

Create a banking system where different banks calculate interest differently.
This question helps you understand method overriding, which is one of the most important types of runtime polymorphism in Java.

You need to create:

A parent class named Bank
A method named calculateInterest()
Multiple child classes like:
SBI
HDFC
ICICI

Each bank should return a different interest rate.

The main goal is to understand how the same method behaves differently depending on the object type.

This question teaches:

Runtime polymorphism
Method overriding
Inheritance
Dynamic method dispatch
Example 1
Input:
SBI bank

Output:
Interest Rate: 6.5%
Example 2
Input:
HDFC bank

Output:
Interest Rate: 7.0%
Example 3
Input:
ICICI bank

Output:
Interest Rate: 6.8%
2. Shape Area Calculator
Description

Design a program where different shapes calculate area differently using the same method name area().

Create:

Parent class Shape
Child classes:
Circle
Rectangle
Triangle

Each class should override the area() method.

This problem is excellent for understanding:

Real-world polymorphism
Method overriding
Object-oriented design
Reusability of code

The same method call:

shape.area();

will produce different outputs depending on the object.

Example 1
Input:
Circle radius = 5

Output:
Area = 78.5
Example 2
Input:
Rectangle length = 4, width = 6

Output:
Area = 24
Example 3
Input:
Triangle base = 10, height = 8

Output:
Area = 40
3. Animal Sound System
Description

Create an animal sound simulator using polymorphism.

Make:

Parent class Animal
Child classes:
Dog
Cat
Cow

Each child class should override the method:

makeSound()

This question demonstrates how the same method can produce different behavior.

This is one of the most common beginner-level interview questions for polymorphism.

Concepts learned:

Runtime polymorphism
Method overriding
Inheritance hierarchy
Dynamic binding
Example 1
Input:
Dog object

Output:
Dog barks
Example 2
Input:
Cat object

Output:
Cat meows
Example 3
Input:
Cow object

Output:
Cow moos
4. Employee Salary System (Method Overloading + Overriding)
Description

Build an employee management system where salary can be calculated differently for different employees.

Use:

Parent class Employee
Child classes:
Developer
Manager
Intern

Also include:

Method overloading for bonus calculation
Method overriding for salary display

This question combines:

Compile-time polymorphism
Runtime polymorphism
Inheritance
OOP design principles

You can create overloaded methods like:

calculateBonus(int salary)
calculateBonus(int salary, int performance)

This helps you understand how Java supports multiple forms of polymorphism.

Example 1
Input:
Developer salary = 50000

Output:
Developer Total Salary = 60000
Example 2
Input:
Manager salary = 80000

Output:
Manager Total Salary = 100000
Example 3
Input:
Intern salary = 15000

Output:
Intern Total Salary = 17000