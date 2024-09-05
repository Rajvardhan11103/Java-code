/* Checking Existence:
Write a Java program to create a LinkedList of strings. Add five city names to the list. 
Check if the list contains the city "Paris" and display the result. */ 

import java.util.LinkedList;

class CityListDemo {
    public static void main(String[] args) {
       
        LinkedList<String> cityList = new LinkedList<>();

         
        cityList.add("New York");
        cityList.add("London");
        cityList.add("Tokyo");
        cityList.add("Paris");
        cityList.add("Sydney");

        
        boolean containsParis = cityList.contains("Paris");

           
        if (containsParis) {
            System.out.println("The list contains the city \"Paris\".");
        } else {
            System.out.println("The list does not contain the city \"Paris\".");
        }
    }
}
