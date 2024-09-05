/* 2. Accessing Elements:
Write a Java program to create an ArrayList of integers. Add the first ten natural 
numbers to the list. Then, print the third element of the list. */

import java.util.ArrayList;

class NaturalNumbersList {
    public static void main(String[] args) {
         
        ArrayList<Integer> numbers = new ArrayList<>();

         
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

         
        System.out.println("The third element in the list is: " + numbers.get(2));
    }
}
