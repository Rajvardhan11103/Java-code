/*  Problem 5: Printer
Description: Create a Printer class that can print different types of data using method 
overloading.
Requirements:
1. Implement a method print(int number) to print an integer.
2. Implement a method print(double number) to print a double.
3. Implement a method print(String message) to print a string.
4. Implement a method print(int[] numbers) to print an array of integers.  */ 

public class Printer {

     
    public void print(int number) {
        System.out.println("Integer: " + number);
    }

     
    public void print(double number) {
        System.out.println("Double: " + number);
    }

   
    public void print(String message) {
        System.out.println("String: " + message);
    }

     
    public void print(int[] numbers) {
        System.out.print("Array of integers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        // Print an integer
        printer.print(42);

        // Print a double
        printer.print(3.14159);

        // Print a string
        printer.print("Hello, World!");

        // Print an array of integers
        int[] intArray = {1, 2, 3, 4, 5};
        printer.print(intArray);
    }
}
