/* NullPointerException
1. Problem Statement:
o Write a program that initializes a String variable to null and attempts to call a 
method on it. Handle the NullPointerException and provide a meaningful error 
message to the user */

import java.io.*;

class NullPointerExample {
    public static void main(String[] args) {
        String str = null;

        try {
            // Attempt to call a method on the null string
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Handle the NullPointerException
            System.out.println("Error: Attempted to call a method on a null object. Please ensure the object is properly initialized before use.");
        }
    }
}
