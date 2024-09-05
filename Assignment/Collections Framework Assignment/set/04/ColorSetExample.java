/* 4. Iterating through a Set:
Write a Java program to create a HashSet of String values where each string represents a 
color. Add six different colors to the set. Use both a for-each loop and an Iterator to 
iterate through the set and print each color */ 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class ColorSetExample {
    public static void main(String[] args) {
 
        Set<String> colorSet = new HashSet<>();

        // Add different colors
        colorSet.add("Red");
        colorSet.add("Green");
        colorSet.add("Blue");
        colorSet.add("Yellow");
        colorSet.add("Orange");
        colorSet.add("Purple");

       
        System.out.println("Colors using for-each loop:");
        for (String color : colorSet) {
            System.out.println(color);
        }

         
        System.out.println("\nColors using Iterator:");
        Iterator<String> iterator = colorSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
