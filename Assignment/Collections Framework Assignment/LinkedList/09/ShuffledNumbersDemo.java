/* 9. Shuffling a LinkedList:
Write a Java program to create a LinkedList of integers. Add the first ten natural 
numbers to the list. Shuffle the list randomly and display the shuffled list.
*/ 

import java.util.LinkedList;
import java.util.Collections;

class ShuffledNumbersDemo {
    public static void main(String[] args) {
 
        LinkedList<Integer> naturalNumbers = new LinkedList<>();

         
        for (int i = 1; i <= 10; i++) {
            naturalNumbers.add(i);
        }

        // Shuffle the list randomly
        Collections.shuffle(naturalNumbers);

         
        System.out.println("Shuffled list of natural numbers:");
        for (int number : naturalNumbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Print a newline
    }
}
