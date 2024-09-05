/* 7. Sorting an ArrayList:
Write a Java program to create an ArrayList of strings. Add five country names to the 
list. Sort the list in alphabetical order and display the sorted list. */ 

import java.util.ArrayList;
import java.util.Collections;

class CountryList {
    public static void main(String[] args) {
         
        ArrayList<String> countries = new ArrayList<>();

        
        countries.add("India");
        countries.add("Australia");
        countries.add("Canada");
        countries.add("Brazil");
        countries.add("Denmark");

         
        Collections.sort(countries);

         
        System.out.println("Sorted list of countries: " + countries);
    }
}
