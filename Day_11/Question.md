1. Single Inheritance (Basic)

You are given a class Animal with method sound().

Create a subclass Dog that inherits from Animal and overrides the method to print "Bark".

Example:

Input:
(No input)

Output:

Bark
Explanation:

The child class overrides the parent method using inheritance.

2. Using super Keyword

You are given a class Person with attribute name.

Create a subclass Student with attribute rollNo.

Use constructor and super keyword to initialize both values.

Example:

Input:

Name: Harshit
RollNo: 101

Output:

Name: Harshit
RollNo: 101
Explanation:

super() is used to call the parent class constructor.

3. Method Inheritance Without Override

You are given a class Vehicle with method start() that prints "Vehicle Started".

Create a subclass Car that uses the same method without overriding.

Example:

Input:
(No input)

Output:

Vehicle Started
Explanation:

Child class inherits method directly from parent.

4. Multilevel Inheritance

You are given:

Class Animal
Class Dog extends Animal
Class Puppy extends Dog

Each class has a method:

Animal → eat()
Dog → bark()
Puppy → weep()
Example:

Input:
(No input)

Output:

Eating
Barking
Weeping
Explanation:

Child class can access all methods from parent and grandparent.

5. Hierarchical Inheritance

You are given a class Shape.

Create two subclasses:

Circle
Rectangle

Each class has its own method:

Circle → prints "Circle"
Rectangle → prints "Rectangle"
Example:

Input:
(No input)

Output:

Circle
Rectangle
Explanation:

Multiple classes inherit from the same parent.

6. Constructor in Inheritance

You are given:

Parent class Employee with constructor printing "Employee Created"
Child class Manager with constructor printing "Manager Created"
Example:

Input:

Manager m = new Manager();

Output:

Employee Created
Manager Created
Explanation:

Parent constructor is called first automatically.

7. Method Overriding 

You are given a class Bank with method getInterest() returning 5%.

Create a subclass SBI that overrides it to return 7%.

Example:

Input:
(No input)

Output:

7%
Explanation:

Child class changes behavior of parent method.

8. Runtime Polymorphism (Inheritance Based)

You are given:

Class Animal → method sound()
Class Dog → overrides sound()

Use parent reference:

Animal a = new Dog();
a.sound();
Output:
Bark
Explanation:

Method call is decided at runtime.
9. Check Access of Protected Members

You are given a class Parent with a protected variable.

Access it in child class.

Explanation:

protected members are accessible in subclasses.