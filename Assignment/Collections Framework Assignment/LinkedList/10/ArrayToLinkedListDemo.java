/* 10. Converting an Array to LinkedList:
Write a Java program to create an array of strings with five elements. Convert this 
array into a LinkedList and display the contents of the LinkedList */ 

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ArrayToLinkedListDemo {
    public static void main(String[] args) {
         
        String[] stringArray = {"Apple", "Banana", "Orange", "Grapes", "Mango"};

        // Convert the array to a LinkedList
        List<String> stringList = new LinkedList<>(Arrays.asList(stringArray));

         
        System.out.println("Contents of the LinkedList:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}
