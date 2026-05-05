Problem 4.1

Write a class Payment with a method pay() that returns "Processing payment".

This class represents a general payment system where the payment method is not specified.

Input	Return Value
Payment().pay()	"Processing payment"
Problem 4.2

Write a class CardPayment that inherits from the Payment class.
Override the pay() method so that it returns "Payment made using card".

This problem demonstrates abstraction because different payment methods can provide their own implementation of payment processing.

Input	Return Value
CardPayment().pay()	"Payment made using card"
CardPayment().pay()	"Payment made using card"
CardPayment().pay()	"Payment made using card"

#####################################################################

Problem 5.1

Write a class Employee with a method work() that returns "Employee is working".

This class represents a general employee without defining a specific role.

Input	Return Value
Employee().work()	"Employee is working"
Problem 5.2

Write a class Developer that inherits from the Employee class.
Override the work() method so that it returns "Developer is writing code".

This demonstrates abstraction because the parent class defines a common activity while the child class defines the exact task.

Input	Return Value
Developer().work()	"Developer is writing code"
Developer().work()	"Developer is writing code"
Developer().work()	"Developer is writing code"

#####################################################################

Problem 6.1

Write a class Notification with a method send() that returns "Sending notification".

This class represents a general notification system.

Input	Return Value
Notification().send()	"Sending notification"
Problem 6.2

Write a class SMSNotification that inherits from the Notification class.
Override the send() method so that it returns "SMS sent successfully".

This problem demonstrates abstraction because different notification types can implement sending in different ways.

Input	Return Value
SMSNotification().send()	"SMS sent successfully"
SMSNotification().send()	"SMS sent successfully"
SMSNotification().send()	"SMS sent successfully"