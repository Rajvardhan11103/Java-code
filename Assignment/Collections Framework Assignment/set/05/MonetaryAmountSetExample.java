/* 5. Size of a Set:
Write a Java program to create a LinkedHashSet of Double values representing various 
monetary amounts. Add four different amounts to the set. Display the size of the set.*/ 

import java.util.LinkedHashSet;
import java.util.Set;

class MonetaryAmountSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet to store monetary amounts
        Set<Double> amountSet = new LinkedHashSet<>();

        // Add different monetary amounts
        amountSet.add(100.50);
        amountSet.add(75.25);
        amountSet.add(150.75);
        amountSet.add(200.0);

        // Display the size of the set
        int setSize = amountSet.size();
        System.out.println("Size of the monetary amount set: " + setSize);
    }
}
