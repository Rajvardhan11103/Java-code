/* 8. Copying an ArrayList:
Write a Java program to create two ArrayList objects of integers. Add the first five 
prime numbers to the first list. Copy the contents of the first list into the second list */ 

import java.util.ArrayList;

class PrimeNumberList {
    public static void main(String[] args) {
         
        ArrayList<Integer> primeNumbers = new ArrayList<>();

       
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);

        
        ArrayList<Integer> copiedList = new ArrayList<>(primeNumbers);

       
        System.out.println("First list (prime numbers): " + primeNumbers);
        System.out.println("Second list (copied list): " + copiedList);
    }
}
