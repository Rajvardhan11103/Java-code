/*  8. Problem Statement: Insufficient Balance Exception
o Define a custom unchecked exception InsufficientBalanceException. Write a 
program that simulates a simple bank account with deposit and withdrawal 
methods. Throw InsufficientBalanceException if a withdrawal amount exceeds 
the account balance.  */

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance +amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal of " + amount);
        } else {
            balance =  balance - amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); 

        account.deposit(500);  
        account.withdraw(200);  

        try {
            account.withdraw(1500);  
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
