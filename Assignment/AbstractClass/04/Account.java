/* Problem 4: Abstract Account
Description: Create an abstract class Account to represent different types of bank accounts. Each 
account should have a method to calculate the interest.
Requirements:
1. Create an abstract class Account with an abstract method calculateInterest().
2. Create concrete classes SavingsAccount, CurrentAccount, and FixedDepositAccount that extend 
Account and implement the calculateInterest() method.
3. Add attributes to each concrete class: SavingsAccount should have balance and interestRate, 
CurrentAccount should have balance and overdraftLimit, and FixedDepositAccount should have 
principalAmount and tenure.
4. Implement a main method to create instances of each account type and display their 
calculated interest.
  */
  
  abstract class Account {
    abstract double calculateInterest();
}

class SavingsAccount extends Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class CurrentAccount extends Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    double calculateInterest() {
         
        return 0;
    }
}
class FixedDepositAccount extends Account {
    private double principalAmount;
    private double interestRate;
    private int tenure;  

    public FixedDepositAccount(double principalAmount, double interestRate, int tenure) {
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    @Override
    double calculateInterest() {
        return principalAmount * interestRate / 100 * tenure;
    }
}
class AccountTest {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(10000, 5);  
        Account currentAccount = new CurrentAccount(5000, 1000);  
        Account fixedDepositAccount = new FixedDepositAccount(20000, 7, 3);  

        System.out.printf("Savings Account Interest: %.2f%n", savingsAccount.calculateInterest());
        System.out.printf("Current Account Interest: %.2f%n", currentAccount.calculateInterest());
        System.out.printf("Fixed Deposit Account Interest: %.2f%n", fixedDepositAccount.calculateInterest());
    }
}


