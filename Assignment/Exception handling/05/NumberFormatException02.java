/*  NumberFormatException
5. Problem Statement:
o Write a program that takes a string input from the user and attempts to parse it as 
an integer. Handle the NumberFormatException if the input is not a valid integer.  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 class NumberFormatExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a number: ");
            String input = reader.readLine();
            int number = Integer.parseInt(input);
            System.out.println("You entered the number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input is not a valid integer. Please enter a valid number.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading input. Please try again.");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error: An I/O error occurred while closing the reader.");
            }
        }
    }
}
