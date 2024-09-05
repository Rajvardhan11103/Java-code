/* 8. Copying a Vector:
Write a Java program to create two Vector objects of integers. Add the first five prime 
numbers to the first vector. Copy the contents of the first vector into the second vector and 
display both vectors. */ 

import java.util.Vector;

class VectorCopyExample {
    public static void main(String[] args) {
        
        Vector<Integer> firstVector = new Vector<>();
        firstVector.add(2);
        firstVector.add(3);
        firstVector.add(5);
        firstVector.add(7);
        firstVector.add(11); // Adding the fifth prime number

        
        Vector<Integer> secondVector = new Vector<>();

       
        secondVector.addAll(firstVector);

        
        System.out.println("First Vector: " + firstVector);
        System.out.println("Second Vector (copied from the first): " + secondVector);
    }
}
