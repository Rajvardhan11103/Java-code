/* 8. Copying a Stack:
Write a Java program to create two Stack objects of integers. Push the first five prime 
numbers onto the first stack. Copy the contents of the first stack into the second stack and 
display both stacks. */ 

import java.util.Stack;

class StackCopyExample {
    public static void main(String[] args) {
         
        Stack<Integer> firstStack = new Stack<>();

        
        firstStack.push(2);
        firstStack.push(3);
        firstStack.push(5);
        firstStack.push(7);
        firstStack.push(11);

         
        Stack<Integer> secondStack = new Stack<>();

         
        secondStack.addAll(firstStack);

         
        System.out.println("First stack (prime numbers): " + firstStack);
        System.out.println("Second stack (copied from the first stack): " + secondStack);
    }
}
