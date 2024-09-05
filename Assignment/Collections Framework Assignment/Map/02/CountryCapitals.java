/* 2. Accessing Values:
Write a Java program to create a TreeMap where the keys are strings representing 
country names and the values are their respective capitals. Add five country-capital 
pairs to the map. Retrieve and print the capital of a specific country. */ 

import java.util.TreeMap;

class CountryCapitals {
    public static void main(String[] args) {
        // Create a TreeMap to store country-capital pairs
        TreeMap<String, String> countryCapitalsMap = new TreeMap<>();

        // Add country-capital pairs
        countryCapitalsMap.put("India", "New Delhi");
        countryCapitalsMap.put("United States", "Washington, D.C.");
        countryCapitalsMap.put("United Kingdom", "London");
        countryCapitalsMap.put("Japan", "Tokyo");
        countryCapitalsMap.put("Brazil", "Brasília");

        // Retrieve and print the capital of a specific country (e.g., India)
        String countryToLookup = "India";
        String capital = countryCapitalsMap.get(countryToLookup);

        if (capital != null) {
            System.out.println("Capital of " + countryToLookup + ": " + capital);
        } else {
            System.out.println("Capital not found for " + countryToLookup);
        }
    }
}
