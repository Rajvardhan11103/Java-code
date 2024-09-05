/* 1. Creating and Adding Elements:
Write a Java program to create a Vector of strings. Add five different fruit names to the vector 
and display the contents of the vector. */ 

import java.util.Vector;

public class FruitVectorExample {
    public static void main(String[] args) {
        
        Vector<String> fruitVector = new Vector<>();

        
        fruitVector.add("Apple");
        fruitVector.add("Banana");
        fruitVector.add("Orange");
        fruitVector.add("Grapes");
        fruitVector.add("Mango");
 
        System.out.println("Fruit names in the vector:");
        for (String fruit : fruitVector) {
            System.out.println(fruit);
        }
    }
}
