/* 1. Creating and Adding Entries:
Write a Java program to create a HashMap of integers and strings. Add five key-value 
pairs where the keys are integers and the values are strings. Display the contents of 
the map */ 

import java.util.HashMap;
import java.util.Map;

class HashMapExample {
    public static void main(String[] args) {
         
        Map<Integer, String> myMap = new HashMap<>();

        
        myMap.put(1, "Apple");
        myMap.put(2, "Banana");
        myMap.put(3, "Cherry");
        myMap.put(4, "Date");
        myMap.put(5, "Fig");

        // Display the contents of the map using a for loop
        System.out.println("Contents of the map:");
		System.out.println(myMap);

    }
}
