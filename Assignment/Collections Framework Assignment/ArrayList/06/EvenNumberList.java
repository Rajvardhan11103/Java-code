/* 6. Iterating through an ArrayList:
Write a Java program to create an ArrayList of integers. Add the first ten even numbers 
to the list. Use a for loop and an Iterator to iterate through the list and print each 
element.
 */ 
 
import java.util.ArrayList;
import java.util.Iterator;

class EvenNumbersList {
    public static void main(String[] args) {
         
        ArrayList<Integer> evenNumbers = new ArrayList<>();

         
        for (int i = 1; i <= 10; i++) {
            evenNumbers.add(i * 2);
        }

         
        System.out.println("Using for loop:");
        for (int number : evenNumbers) {
            System.out.println(number);
        }

        
        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = evenNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
