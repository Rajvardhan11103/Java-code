/* Scenario 2: Bank Account Management
Problem Statement: You are developing a system to manage bank accounts in Java. Each bank 
account can have multiple transactions (deposits and withdrawals). Implement the bank account 
system using an outer class for the account and an inner class for transactions.
Requirements:
1. BankAccount Class (Outer Class):
o Maintain account details like account number, holder name, and balance.
o Provide methods to deposit money, withdraw money, and get current balance.
2. Transaction Class (Inner Class):
o Define an inner class Transaction within BankAccount to represent each transaction.
o Each Transaction should have properties like transaction ID, amount, and type 
(deposit or withdrawal).
o Implement methods in Transaction class to record and retrieve transaction details.
3. Testing:
o Create instances of BankAccount in a main class.
o Use methods of BankAccount to perform transactions (deposit and withdraw).
o Demonstrate the use of inner class Transaction by recording transactions and 
displaying transaction history. */ 

import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private List<Transaction> transactionHistory;

    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    // Inner class representing a transaction
    private class Transaction {
        private int transactionId;
        private double amount;
        private String type; // "deposit" or "withdrawal"

        public Transaction(int transactionId, double amount, String type) {
            this.transactionId = transactionId;
            this.amount = amount;
            this.type = type;
        }

        // Getters for transaction properties
        public int getTransactionId() {
            return transactionId;
        }

        public double getAmount() {
            return amount;
        }

        public String getType() {
            return type;
        }
    }

    // Deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction(transactionHistory.size() + 1, amount, "deposit"));
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction(transactionHistory.size() + 1, amount, "withdrawal"));
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Get current balance
    public double getCurrentBalance() {
        return balance;
    }

    // Display transaction history
    public void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println("ID: " + transaction.getTransactionId() +", Amount: $" + transaction.getAmount() +", Type: " + transaction.getType());
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "John Doe", 1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.deposit(300.0);

        System.out.println("Current Balance: $" + account.getCurrentBalance());
        account.displayTransactionHistory();
    }
}
