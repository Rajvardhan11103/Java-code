/*  Iterating through a LinkedList:
Write a Java program to create a LinkedList of integers. Add the first ten even numbers 
to the list. Use a for loop and an Iterator to iterate through the list and print each 
element. Iterating through a LinkedList:
Write a Java program to create a LinkedList of integers. Add the first ten even numbers 
to the list. Use a for loop and an Iterator to iterate through the list and print each 
element. */ 

import java.util.LinkedList;
import java.util.Iterator;

class EvenNumbersListDemo {
    public static void main(String[] args) {
        
        LinkedList<Integer> evenNumbersList = new LinkedList<>();

        
        for (int i = 2; i <= 20; i += 2) {
            evenNumbersList.add(i);
        }

        
        System.out.println("Using a for loop:");
        for (int number : evenNumbersList) {
            System.out.print(number + " ");
        }
        System.out.println();  

         
        System.out.println("Using an Iterator:");
        Iterator<Integer> iterator = evenNumbersList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();  
    }
}
