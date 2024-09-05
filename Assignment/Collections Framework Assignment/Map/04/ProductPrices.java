/* 4. Removing Entries:
Write a Java program to create a HashMap of String keys and Double values representing 
product names and their prices. Add five product-price pairs to the map. Remove an 
entry with a specific key and display the remaining entries.  */ 

import java.util.HashMap;
import java.util.Map;

class ProductPrices {
    public static void main(String[] args) {
        // Create a HashMap to store product names and prices
        Map<String, Double> productPrices = new HashMap<>();

        // Add five product-price pairs
        productPrices.put("Apple", 1.99);
        productPrices.put("Banana", 0.79);
        productPrices.put("Orange", 1.49);
        productPrices.put("Grapes", 2.29);
        productPrices.put("Pineapple", 3.99);

        // Remove an entry with a specific key (e.g., "Banana")
        String productToRemove = "Banana";
        productPrices.remove(productToRemove);

        // Display the remaining entries
        System.out.println("Remaining product prices:");
		System.out.println(productPrices);

    }
}
