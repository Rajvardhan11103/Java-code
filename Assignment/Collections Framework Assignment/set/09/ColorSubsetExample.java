/* 9. Subset Check:
Write a Java program to create two TreeSet objects containing String values. The first 
set should represent a list of primary colors, and the second set should represent a list 
of colors that includes primary colors and others. Check if the first set is a subset of 
the second set and display the result. */ 

import java.util.Set;
import java.util.TreeSet;

class ColorSubsetExample {
    public static void main(String[] args) {
         
        Set<String> primaryColors = new TreeSet<>();
        primaryColors.add("Red");
        primaryColors.add("Blue");
        primaryColors.add("Yellow");

       
        Set<String> allColors = new TreeSet<>();
        allColors.add("Red");
        allColors.add("Blue");
        allColors.add("Yellow");
        allColors.add("Green");
        allColors.add("Orange");
        allColors.add("Purple");

        // Check if primaryColors is a subset of allColors
        boolean isSubset = allColors.containsAll(primaryColors);

        // Display the result
        if (isSubset) {
            System.out.println("Primary colors are a subset of the full color set.");
        } else {
            System.out.println("Primary colors are not a subset of the full color set.");
        }
    }
}
