/* 10. Converting an Array to Vector:
Write a Java program to create an array of strings with five elements. Convert this array into 
a Vector and display the contents of the Vector. */ 

import java.util.Vector;

class ArrayToVectorExample {
    public static void main(String[] args) {
        
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Fig"};

        // Convert the array into a Vector
        Vector<String> stringVector = new Vector<>();
        for (String element : stringArray) {
            stringVector.add(element);
        }

        // Display the contents of the Vector
        System.out.println("Contents of the Vector:");
        for (String element : stringVector) {
            System.out.println(element);
        }
    }
}
