/* 6. Iterating through a Map:
Write a Java program to create a HashMap of String keys and Integer values where the 
keys are city names and the values are their populations. Add five city-population 
pairs to the map. Use a for-each loop and an Iterator to iterate through the map and print 
each key-value pair. */ 


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class CityPopulations {
    public static void main(String[] args) {
        // Create a HashMap to store city names and populations
        Map<String, Integer> cityPopulations = new HashMap<>();

        // Add five city-population pairs
        cityPopulations.put("New York", 8537673);
        cityPopulations.put("Los Angeles", 3977683);
        cityPopulations.put("Chicago", 2695598);
        cityPopulations.put("Houston", 2320268);
        cityPopulations.put("Phoenix", 1680992);

        // Using a for-each loop to iterate through the map
        System.out.println("City populations using for-each loop:");
        for (Map.Entry<String, Integer> entry : cityPopulations.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using an Iterator to iterate through the map
        System.out.println("\nCity populations using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = cityPopulations.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

