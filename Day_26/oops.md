Problem 1.1
Write a class Shape that represents a general shape.
The class should contain a method area() that returns the message "Area not defined" because different shapes have different formulas for area.
InputReturn ValueShape().area()"Area not defined"

Problem 1.2
Write a class Circle that inherits from the Shape class.
Override the area() method so that it calculates and returns the area of the circle using the formula:
Area = π × r × r
Take π = 3.14
Note: This problem demonstrates abstraction because the base class provides a general method, while the child class gives the actual implementation.
InputReturn ValueCircle(2).area()12.56Circle(3).area()28.26Circle(5).area()78.5 


#####################################################################
Problem 2.1
Write a class Vehicle with a method start() that returns "Vehicle started".
This class represents a general vehicle where the exact starting behavior is not specified.
InputReturn ValueVehicle().start()"Vehicle started"

Problem 2.2
Write a class Bike that inherits from the Vehicle class.
Override the start() method so that it returns "Bike started with self-start".
This shows abstraction because the parent class defines a common action, while the child class provides a specific implementation.
InputReturn ValueBike().start()"Bike started with self-start"Bike().start()"Bike started with self-start"Bike().start()"Bike started with self-start"
#####################################################################


Problem 3.1
Write a class Animal with a method sound() that returns "Animal makes sound".
The class represents a general animal where the exact sound is not defined.
InputReturn ValueAnimal().sound()"Animal makes sound"

Problem 3.2
Write a class Cat that inherits from the Animal class.
Override the sound() method so that it returns "Cat meows".
This demonstrates abstraction because the base class gives a common structure and the child class provides its own behavior.
InputReturn ValueCat().sound()"Cat meows"Cat().sound()"Cat meows"Cat().sound()"Cat meows"