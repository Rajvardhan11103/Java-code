/* 1. Creating and Adding Elements:
Write a Java program to create a Stack of strings. Push five different fruit names onto the 
stack and display the contents of the stack.
*/ 
import java.util.Stack;

class FruitStackDemo {
    public static void main(String[] args) {
        // Create a Stack of strings
        Stack<String> fruitStack = new Stack<>();

        // Push five different fruit names onto the stack
        fruitStack.push("Apple");
        fruitStack.push("Banana");
        fruitStack.push("Orange");
        fruitStack.push("Grapes");
        fruitStack.push("Pineapple");

        // Display the contents of the stack
        System.out.println("Fruit stack contents:");
        while (!fruitStack.isEmpty()) {
            System.out.println(fruitStack.pop());
        }
    }
}

