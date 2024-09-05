/* 1. Creating and Adding Elements:
Write a Java program to create a LinkedList of strings. Add five different fruit names to 
the list and display the contents of the list. */ 

import java.util.ArrayList;
import java.util.List;

class FruitListDemo {
    public static void main(String[] args) {
        
        List<String> fruitList = new ArrayList<>();

         
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Grapes");
        fruitList.add("Mango");

         
        System.out.println("Fruit List:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }
}
