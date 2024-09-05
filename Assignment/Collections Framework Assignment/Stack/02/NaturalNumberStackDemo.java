/* 2. Accessing Elements:
Write a Java program to create a Stack of integers. Push the first ten natural numbers onto the 
stack. Then, print the top element of the stack without removing it. */ 

import java.util.Stack;

class NaturalNumberStackDemo {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> numberStack = new Stack<>();

        // Push the first ten natural numbers onto the stack
        for (int i = 1; i <= 10; i++) {
            numberStack.push(i);
        }

        // Print the top element (without removing it)
        if (!numberStack.isEmpty()) {
            int topElement = numberStack.peek();
            System.out.println("Top element of the stack: " + topElement);
        } else {
            System.out.println("Stack is empty.");
        }
    }
}
