/* 6. Iterating through a Vector:
Write a Java program to create a Vector of integers. Add the first ten even numbers to the 
vector. Use a for loop and an Iterator to iterate through the vector and print each element. */ 

 import java.util.Vector;
import java.util.Iterator;

class EvenNumberVectorExample {
    public static void main(String[] args) {
         
        Vector<Integer> evenNumberVector = new Vector<>();

         
        for (int i = 2; i <= 20; i += 2) {
            evenNumberVector.add(i);
        }

       
        System.out.println("Using a for loop to print even numbers from the vector:");
        for (int number : evenNumberVector) {
            System.out.print(number + " ");
        }
        System.out.println(); // Print a newline

         
        System.out.println("Using an Iterator to print even numbers from the vector:");
        Iterator<Integer> iterator = evenNumberVector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // Print a newline
    }
}
