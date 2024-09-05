/* IOException
3. Problem Statement:
o Write a program that reads a String specified by the user using BufferedReader. 
Handle IOException */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a string: ");
            String input = reader.readLine();
            System.out.println("You entered: " + input);
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
