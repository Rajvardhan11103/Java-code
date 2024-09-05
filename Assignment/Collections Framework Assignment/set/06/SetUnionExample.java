/* 6. Set Union:
Write a Java program to create two HashSet objects containing String values. The first 
set should include names of various fruits, and the second set should include names of 
various vegetables. Compute and display the union of these two sets. */ 

import java.util.HashSet;
import java.util.Set;

class SetUnionExample {
    public static void main(String[] args) {
        // Create a HashSet for fruits
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Create a HashSet for vegetables
        Set<String> vegetables = new HashSet<>();
        vegetables.add("Carrot");
        vegetables.add("Spinach");
        vegetables.add("Tomato");
        vegetables.add("Broccoli");

        // Compute the union (combined set) of fruits and vegetables
        Set<String> combinedSet = new HashSet<>(fruits);
        combinedSet.addAll(vegetables);

        // Display the union
        System.out.println("Union of fruits and vegetables:");
        for (String item : combinedSet) {
            System.out.println(item);
        }
    }
}
