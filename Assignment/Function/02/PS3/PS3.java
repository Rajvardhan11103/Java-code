/* PS3 :- Write a program in java to count the digits of the given number */ 

import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        // Ensure the input is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int digitCount = 0;
        long tempNumber = number; // A copy of the original number

        // Count the digits
        while (tempNumber > 0) {
            tempNumber /= 10;
            digitCount++;
        }

        System.out.println("Number of digits in " + number + ": " + digitCount);

        scanner.close();
    }
}

