/* 5. Checking Existence:
Write a Java program to create a Stack of strings. Push five city names onto the stack. Check
if the stack contains the city "Paris" and display the result. */ 

import java.util.Stack;

class CityStackExample {
    public static void main(String[] args) {
         
        Stack<String> cityStack = new Stack<>();

        
        cityStack.push("New York");
        cityStack.push("London");
        cityStack.push("Tokyo");
        cityStack.push("Paris");
        cityStack.push("Sydney");

       
        boolean containsParis = cityStack.contains("Paris");

        
        if (containsParis) {
            System.out.println("The stack contains the city Paris.");
        } else {
            System.out.println("The stack does not contain the city Paris.");
        }
    }
}
