 /* Problem 2: Payment System
Description: Create a class hierarchy for different payment methods, where each method 
processes payment differently. Use method overriding to achieve polymorphism.
Requirements:
1. Create a base class Payment with a method processPayment().
2. Create derived classes CreditCardPayment, DebitCardPayment, and PayPalPayment, each 
overriding the processPayment() method to process payments in their respective ways.
3. Implement a main method to demonstrate calling processPayment() on different payment 
objects stored in a Payment array. */

 
class Payment {
    public void processPayment() {
        System.out.println("Processing generic payment");
    }
}

 
class CreditCardPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

 
class DebitCardPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing debit card payment");
    }
}

 
class PayPalPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment");
    }
}
class PaymentSystemDemo {
    public static void main(String[] args) {
         
        Payment creditCardPayment = new CreditCardPayment();
        Payment debitCardPayment = new DebitCardPayment();
        Payment payPalPayment = new PayPalPayment();

         
        creditCardPayment.processPayment();
        debitCardPayment.processPayment();
        payPalPayment.processPayment();
    }
}
