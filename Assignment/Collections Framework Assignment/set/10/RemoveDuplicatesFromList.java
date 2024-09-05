/* 10. Removing Duplicates from a List:
Write a Java program to create a List of String values with some duplicate elements. 
Convert this list to a Set to remove duplicates and then convert it back to a List. 
Display the original list and the list after removing duplicates */ 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Apple");  
        originalList.add("Grapes");
        originalList.add("Banana");  

        // Convert the list to a set to remove duplicates
        Set<String> uniqueSet = new HashSet<>(originalList);

        // Convert the set back to a list
        List<String> listWithoutDuplicates = new ArrayList<>(uniqueSet);

        // Display the original list
        System.out.println("Original list:");
        for (String fruit : originalList) {
            System.out.println(fruit);
        }

        // Display the list without duplicates
        System.out.println("\nList without duplicates:");
        for (String uniqueFruit : listWithoutDuplicates) {
            System.out.println(uniqueFruit);
        }
    }
}
