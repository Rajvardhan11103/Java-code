/* PS6 :- Write a program in java to calculate sum of the digits at the odd places in the number */ 

import java.util.Scanner;

class OddPlaceDigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        // Ensure the input is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        long tempNumber = number; // A copy of the original number
        long oddPlaceDigitSum = 0;
        boolean isOddPosition = true; // Flag to track odd positions

        // Calculate the sum of digits at odd places
        while (tempNumber > 0) {
            long digit = tempNumber % 10;
            if (isOddPosition) {
                oddPlaceDigitSum += digit;
            }
            isOddPosition = !isOddPosition; // Toggle the flag
            tempNumber /= 10;
        }

        System.out.println("Sum of digits at odd places in " + number + ": " + oddPlaceDigitSum);

 
    }
}
