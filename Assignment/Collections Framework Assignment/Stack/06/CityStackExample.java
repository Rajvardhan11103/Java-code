/* 6. Iterating through a Stack:
Write a Java program to create a Stack of integers. Push the first ten even numbers onto the 
stack. Use a for loop and an Iterator to iterate through the stack and print each element. */ 
 
 import java.util.Stack;
import java.util.Iterator;

class EvenNumberStackExample {
    public static void main(String[] args) {
        
        Stack<Integer> evenNumberStack = new Stack<>();

        // Push the first ten even numbers onto the stack
        for (int i = 2; i <= 20; i = i +2) {
            evenNumberStack.push(i);
        }

         
        System.out.println("Using a for loop to print even numbers from the stack:");
        for (int number : evenNumberStack) {
            System.out.print(number + " ");
        }
        System.out.println(); // Print a newline

         
        System.out.println("Using an Iterator to print even numbers from the stack:");
        Iterator<Integer> iterator = evenNumberStack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();  
    }
}
