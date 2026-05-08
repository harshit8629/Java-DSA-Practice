# Polymorphism Day 2
1. Online Payment Gateway System
Description

Design an online payment system where different payment methods process payments differently using polymorphism.

Create:

Parent class Payment
Child classes:
CreditCardPayment
UPIPayment
PayPalPayment

Each class should override:

processPayment()

The program should simulate how different payment methods work with the same method call.

This question helps you learn:

Runtime polymorphism
Method overriding
Real-world payment systems
Dynamic object binding

You can also add:

Transaction fee
Payment validation
Success messages
Example 1
Input:
Credit Card Payment = 5000

Output:
Processing Credit Card Payment of Rs.5000
Transaction Successful
Example 2
Input:
UPI Payment = 1500

Output:
Processing UPI Payment of Rs.1500
Transaction Successful
Example 3
Input:
PayPal Payment = 8000

Output:
Processing PayPal Payment of Rs.8000
Transaction Successful
2. Vehicle Rental System
Description

Create a vehicle rental management system using polymorphism.

Create:

Parent class Vehicle
Child classes:
Car
Bike
Truck

Each vehicle should calculate rent differently using:

calculateRent(int days)

The same method behaves differently depending on vehicle type.

This project teaches:

Runtime polymorphism
Inheritance
Business logic implementation
Real-world rental systems

You may include:

Insurance charges
Per-day pricing
Fuel charges
Example 1
Input:
Car rented for 5 days

Output:
Total Rent: Rs.10000
Example 2
Input:
Bike rented for 3 days

Output:
Total Rent: Rs.3000
Example 3
Input:
Truck rented for 7 days

Output:
Total Rent: Rs.35000
3. Notification Sending System
Description

Build a notification system where notifications can be sent through multiple platforms.

Create:

Parent class Notification
Child classes:
EmailNotification
SMSNotification
PushNotification

Override:

sendNotification()

This question demonstrates how a single interface can support multiple behaviors.

Topics covered:

Runtime polymorphism
Extensible software design
Method overriding
Messaging systems

You can further add:

Delivery status
Retry system
User-specific notifications
Example 1
Input:
Email Notification

Output:
Sending Email Notification...
Email Sent Successfully
Example 2
Input:
SMS Notification

Output:
Sending SMS Notification...
SMS Delivered Successfully
Example 3
Input:
Push Notification

Output:
Sending Push Notification...
Push Notification Delivered
4. Employee Attendance and Salary System
Description

Develop a company management system where different employees calculate working hours and salaries differently.

Create:

Parent class Employee
Child classes:
FullTimeEmployee
PartTimeEmployee
Freelancer

Override:

calculateSalary()

This problem combines:

Polymorphism
Encapsulation
Inheritance
Salary logic implementation

Different employees should have:

Different pay structures
Overtime calculations
Hourly rates

This is a strong intermediate-level OOP problem.

Example 1
Input:
Full Time Employee salary

Output:
Monthly Salary: Rs.60000
Example 2
Input:
Part Time Employee worked 80 hours

Output:
Salary: Rs.16000
Example 3
Input:
Freelancer completed 4 projects

Output:
Salary: Rs.40000
5. Food Delivery Application
Description

Create a food ordering application where different restaurants prepare orders differently.

Create:

Parent class Restaurant
Child classes:
PizzaRestaurant
BurgerRestaurant
SouthIndianRestaurant

Override:

prepareFood()

This question is useful for understanding:

Runtime polymorphism
Modular programming
Real-world service applications

You may include:

Delivery time
Order status
Food pricing
Example 1
Input:
Pizza order

Output:
Preparing Pizza...
Order Ready in 20 minutes
Example 2
Input:
Burger order

Output:
Preparing Burger...
Order Ready in 10 minutes
Example 3
Input:
Dosa order

Output:
Preparing Dosa...
Order Ready in 15 minutes