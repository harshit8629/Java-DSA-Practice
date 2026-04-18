1. Default Constructor Initialization

You are given a class Student with attributes name and age.

Create a default constructor that initializes:

name = "Unknown"
age = 0

Return the values using a method.

Example:
Input: (No input)

Output:
Name: Unknown
Age: 0
Explanation:

The default constructor assigns predefined values when no object data is provided.

2. Parameterized Constructor

You are given a class Car with attributes brand and price.

Create a parameterized constructor to initialize these values.

Example:
Input:
brand = "BMW", price = 5000000

Output:
Brand: BMW
Price: 5000000
Explanation:

The constructor takes input values and assigns them to object variables.

3. Constructor Overloading

You are given a class Rectangle.

Create:

One constructor with no parameters → sets length = 1, breadth = 1
One constructor with parameters → sets custom values

Return the area.

Example:
Input:
Rectangle r1 = new Rectangle()
Rectangle r2 = new Rectangle(5, 4)

Output:
Area1: 1
Area2: 20
Explanation:

Different constructors allow different ways to create objects.

4. Copy Constructor

You are given a class Person with attributes name and age.

Create a copy constructor that copies values from another object.

Example:
Input:
Person p1 = new Person("Harshit", 20)
Person p2 = new Person(p1)

Output:
Name: Harshit
Age: 20
Explanation:

The copy constructor creates a new object with the same values as an existing object.