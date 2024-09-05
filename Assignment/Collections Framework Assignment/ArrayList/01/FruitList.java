/* 1. Creating and Adding Elements:
Write a Java program to create an ArrayList of strings. Add five different fruit names 
to the list and display the contents of the list */

import java.util.ArrayList;

class FruitList {
    public static void main(String[] args) {
         
        ArrayList<String> fruits = new ArrayList<>();

        // Add five different fruit names to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

         
        System.out.println("Fruits in the list: " + fruits);
    }
}
