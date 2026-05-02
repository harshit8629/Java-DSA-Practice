1. Encapsulation in Online Shopping Cart

You are given a class ShoppingCart with attribute totalAmount.

Create:

private variable totalAmount
method addItem(price)
method removeItem(price)
method getTotalAmount()

The total amount should never become negative.

Example
Input
cart.addItem(2000);
cart.addItem(1500);
cart.removeItem(1000);
Output
Total Amount: 2500
Explanation

The cart amount is hidden using encapsulation.

Only methods can update the total amount safely.

2. Encapsulation in Library Book System

You are given a class LibraryBook with attribute copiesAvailable.

Create:

private variable copiesAvailable
method issueBook()
method returnBook()
method getCopies()

A book can only be issued if copies are available.

Example
Input
book.issueBook();
book.issueBook();
book.returnBook();
Output
Copies Available: 4
Explanation

Encapsulation protects book inventory from invalid updates.

3. Encapsulation in Password Validation System

You are given a class UserAccount with attribute password.

Create:

private variable password
method setPassword()
method getPassword()

Password rules:

minimum 8 characters
otherwise print "Invalid Password"
Example
Input
account.setPassword("java1234");
Output
Password Updated
Password: java1234
Explanation

Sensitive data should be controlled using methods.

Validation is possible because of encapsulation.

4. Encapsulation in Bank Loan System

You are given a class LoanAccount with attribute loanAmount.

Create:

private variable loanAmount
method takeLoan(amount)
method payLoan(amount)
method getLoanAmount()

Loan amount cannot become negative.

Example
Input
loan.takeLoan(50000);
loan.payLoan(20000);
Output
Remaining Loan: 30000
Explanation

Encapsulation keeps loan transactions secure and valid.