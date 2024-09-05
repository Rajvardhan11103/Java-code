/* 3. Updating Elements:
Write a Java program to create a Stack of double values. Push five different values onto the 
stack. Replace the top value with a new value and display the updated stack. */ 

import java.util.Stack;

class DoubleStackExample {
    public static void main(String[] args) {
        
        Stack<Double> doubleStack = new Stack<>();

        
        doubleStack.push(10.5);
        doubleStack.push(20.3);
        doubleStack.push(15.7);
        doubleStack.push(8.2);
        doubleStack.push(12.9);

         
        System.out.println("Original stack:");
        System.out.println(doubleStack);

        
        double newTopValue = 25.0;
        doubleStack.pop(); // Remove the current top value
        doubleStack.push(newTopValue); // Push the new value

       
        System.out.println("Updated stack after replacing the top value:");
        System.out.println(doubleStack);
    }
}
