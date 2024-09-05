/*  Accessing Elements:
Write a Java program to create a LinkedList of integers. Add the first ten natural 
numbers to the list. Then, print the third element of the list. */ 

import java.util.LinkedList;

class NaturalNumbersDemo {
    public static void main(String[] args) {
        
        LinkedList<Integer> naturalNumbers = new LinkedList<>();

         
        for (int i = 1; i <= 10; i++) {
            naturalNumbers.add(i);
        }

        
        int thirdElement = naturalNumbers.get(2);
        System.out.println("Third element (index 2): " + thirdElement);
    }
}
