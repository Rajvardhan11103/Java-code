/* 10. Converting an Array to Stack:
Write a Java program to create an array of strings with five elements. Convert this array into 
a Stack and display the contents of the Stack.*/ 

import java.util.Stack;

class ArrayToStackExample {
    public static void main(String[] args) {
         
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Fig"};

         
        Stack<String> stringStack = new Stack<>();
        for (String element : stringArray) {
            stringStack.push(element);
        }

         
        System.out.println("Contents of the stack:");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }
}
