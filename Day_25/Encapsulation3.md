# Encapsulation Day 3
5. Encapsulation in Hotel Room Booking

You are given a class HotelRoom with attribute roomsBooked.

Create:

private variable roomsBooked
method bookRoom()
method cancelRoom()
method getBookedRooms()

Booked rooms cannot become negative.

Example
Input
hotel.bookRoom();
hotel.bookRoom();
hotel.cancelRoom();
Output
Booked Rooms: 1
Explanation

Encapsulation controls room booking operations safely.

6. Encapsulation in Student Attendance System

You are given a class Attendance with attribute presentDays.

Create:

private variable presentDays
method markPresent()
method getAttendance()

Attendance cannot be modified directly.

Example
Input
attendance.markPresent();
attendance.markPresent();
attendance.markPresent();
Output
Present Days: 3
Explanation

Attendance records are protected using encapsulation.

7. Encapsulation in Digital Wallet

You are given a class Wallet with attribute balance.

Create:

private variable balance
method addMoney()
method spendMoney()
method checkBalance()

Do not allow spending more than available balance.

Example
Input
wallet.addMoney(3000);
wallet.spendMoney(1000);
Output
Balance: 2000
Explanation

Encapsulation prevents invalid wallet transactions.

8. Encapsulation in Electricity Bill System

You are given a class ElectricityBill with attribute units.

Create:

private variable units
method addUnits()
method getBill()

Bill calculation:

bill = units * 8
Example
Input
bill.addUnits(120);
Output
Total Bill: 960
Explanation

The units consumed are hidden and accessed through methods only.