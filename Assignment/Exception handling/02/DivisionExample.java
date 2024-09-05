/* ArithmeticException
2. Problem Statement:
o Write a program that takes two integers as input from the user and performs 
division. Handle the ArithmeticException that occurs when dividing by zero, and 
print an appropriate message.  */

import java.util.Scanner;
import java.io.*;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
             
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Division by zero is not allowed. Please enter a non-zero denominator.");
        }

        scanner.close();
    }
}
