/* 7. Sorting a Stack:
Write a Java program to create a Stack of strings. Push five country names onto the stack. Sort 
the stack in alphabetical order and display the sorted stack. */ 

import java.util.Stack;
import java.util.Collections;

class CountryStackExample {
    public static void main(String[] args) {
         
        Stack<String> countryStack = new Stack<>();

         
        countryStack.push("India");
        countryStack.push("United States");
        countryStack.push("France");
        countryStack.push("Japan");
        countryStack.push("Brazil");

         
        Collections.sort(countryStack);

        
        System.out.println("Sorted stack of country names:");
        System.out.println(countryStack);
    }
}
