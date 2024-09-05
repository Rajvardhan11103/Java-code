/* Problem 1: Payment System
Description: Create an interface Payment to represent different payment methods.
Requirements:
1. Create an interface Payment with a method processPayment(double amount).
2. Implement this interface in classes CreditCardPayment, DebitCardPayment, and PayPalPayment.
3. Each class should provide its own implementation of the processPayment(double amount)
method.
4. Implement a main method to create instances of each payment type and demonstrate 
processing a payment. */

// Define the Payment interface
interface Payment {
    void processPayment(double amount);
}

// Implement the Payment interface in the CreditCardPayment class
class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Add logic for processing credit card payment
    }
}

// Implement the Payment interface in the DebitCardPayment class
class DebitCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing debit card payment of $" + amount);
        // Add logic for processing debit card payment
    }
}

// Implement the Payment interface in the PayPalPayment class
class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Add logic for processing PayPal payment
    }
}

// Main class to demonstrate processing payments
 class PaymentSystem {
    public static void main(String[] args) {
        // Create instances of each payment type
        Payment creditCardPayment = new CreditCardPayment();
        Payment debitCardPayment = new DebitCardPayment();
        Payment payPalPayment = new PayPalPayment();

        // Process payments
        creditCardPayment.processPayment(100.0);
        debitCardPayment.processPayment(200.0);
        payPalPayment.processPayment(300.0);
    }
}
