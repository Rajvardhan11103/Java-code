/* PS7 :- Write a program in java to calculate sum of the digits at the even places in the number. */ 

import java.util.Scanner;

class EvenPlaceDigitSumCalculator {
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
        long evenPlaceDigitSum = 0;
        boolean isOddPosition = false; // Flag to track even positions

        // Calculate the sum of digits at even places
        while (tempNumber > 0) {
            long digit = tempNumber % 10;
            if (!isOddPosition) {
                evenPlaceDigitSum = evenPlaceDigitSum + digit;
            }
            isOddPosition = !isOddPosition; // Toggle the flag
            tempNumber = tempNumber / 10;
        }

        System.out.println("Sum of digits at even places in " + number + ": " + evenPlaceDigitSum);

        scanner.close();
    }
}
