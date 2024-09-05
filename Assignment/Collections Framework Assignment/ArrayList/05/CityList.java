/* 5. Checking Existence:
Write a Java program to create an ArrayList of strings. Add five city names to the list. 
Check if the list contains the city "Paris" and display the result. */ 

import java.util.ArrayList;

class CityList {
    public static void main(String[] args) {
       
        ArrayList<String> cities = new ArrayList<>();

        
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Sydney");

         
        boolean containsParis = cities.contains("Paris");

        
        if (containsParis) {
            System.out.println("The list contains the city Paris.");
        } else {
            System.out.println("The list does not contain the city Paris.");
        }
    }
}
