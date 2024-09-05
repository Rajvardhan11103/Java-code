/* 7. Sorting a Vector:
Write a Java program to create a Vector of strings. Add five country names to the vector. Sort 
the vector in alphabetical order and display the sorted vector */ 

import java.util.Vector;
import java.util.Collections;

class CountryVectorExample {
    public static void main(String[] args) {
         
        Vector<String> countryVector = new Vector<>();

        
        countryVector.add("India");
        countryVector.add("United States");
        countryVector.add("France");
        countryVector.add("Japan");
        countryVector.add("Brazil");

         
        Collections.sort(countryVector);

         
         
        System.out.println("Sorted vector of country names:");
        for (String country : countryVector) {
            System.out.println(country);
        }
    }
}
