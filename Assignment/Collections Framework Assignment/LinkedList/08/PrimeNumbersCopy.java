/* Copying a LinkedList:
Write a Java program to create two LinkedList objects of integers. Add the first five 
prime numbers to the first list. Copy the contents of the first list into the second list 
and display both lists.
 */ 
 
 import java.util.LinkedList;

class PrimeNumbersCopyDemo {
    public static void main(String[] args) {
        
        LinkedList<Integer> primeNumbersList = new LinkedList<>();

         
        primeNumbersList.add(2);
        primeNumbersList.add(3);
        primeNumbersList.add(5);
        primeNumbersList.add(7);
        primeNumbersList.add(11);

         
        LinkedList<Integer> copiedList = new LinkedList<>(primeNumbersList);

        // Display both lists
        System.out.println("Prime Numbers List:");
        System.out.println(primeNumbersList);

        System.out.println("\nCopied List:");
        System.out.println(copiedList);
    }
}
