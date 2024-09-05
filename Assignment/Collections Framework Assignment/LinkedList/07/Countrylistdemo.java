/*  Sorting a LinkedList:
Write a Java program to create a LinkedList of strings. Add five country names to the 
list. Sort the list in alphabetical order and display the sorted list. */ 
import java.util.LinkedList;
import java.util.Collections;

class CountryListDemo {
    public static void main(String[] args) {
        
        LinkedList<String> countryList = new LinkedList<>();

        
        countryList.add("India");
        countryList.add("United States");
        countryList.add("Japan");
        countryList.add("France");
        countryList.add("Australia");

         
        Collections.sort(countryList);

         
        System.out.println("Sorted list of country names:");
        for (String country : countryList) {
            System.out.println(country);
        }
    }
}
