/* 9. Reversing a Stack:
Write a Java program to create a Stack of integers. Push the first ten natural numbers onto the 
stack. Reverse the stack and display the reversed stack. */ 

import java.util.Stack;

class ReverseStackExample {
    public static void main(String[] args) {
         
        Stack<Integer> naturalNumberStack = new Stack<>();

         
        for (int i = 1; i <= 10; i++) {
            naturalNumberStack.push(i);
        }

         
        Stack<Integer> reversedStack = new Stack<>();
        while (!naturalNumberStack.isEmpty()) {
            reversedStack.push(naturalNumberStack.pop());
        }

         
        System.out.println("Reversed stack of natural numbers:");
        System.out.println(reversedStack);
    }
}
