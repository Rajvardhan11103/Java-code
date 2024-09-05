/* 5. Checking Existence:
Write a Java program to create a Vector of strings. Add five city names to the vector. Check if 
the vector contains the city "Paris" and display the result */ 

import java.util.Vector;

class CityVectorExample {
    public static void main(String[] args) {
        
        Vector<String> cityVector = new Vector<>();

         
        cityVector.add("New York");
        cityVector.add("London");
        cityVector.add("Tokyo");
        cityVector.add("Paris");
        cityVector.add("Sydney");

        
        boolean containsParis = cityVector.contains("Paris");

        
        if (containsParis) {
            System.out.println("The vector contains the city \"Paris\".");
        } else {
            System.out.println("The vector does not contain the city \"Paris\".");
        }
    }
}
