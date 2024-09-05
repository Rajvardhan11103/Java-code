/* 10. Converting an Array to ArrayList:
Write a Java program to create an array of strings with five elements. Convert this 
array into an ArrayList and display the contents of the ArrayList. */ 

import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        
        String[] fruitsArray = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

         
        ArrayList<String> fruitsList = new ArrayList<>();
        for (String fruit : fruitsArray) {
            fruitsList.add(fruit);
        }

         
        System.out.println("Contents of the ArrayList: " + fruitsList);
    }
}

