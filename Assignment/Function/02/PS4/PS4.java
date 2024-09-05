/* PS4 :- Write a program in java to calculate the sum of the odd digits of the number. */ 

import java.util.Scanner;

class OddDigitSumCalculator {
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
        long oddDigitSum = 0;

        // Calculate the sum of odd digits
        while (tempNumber > 0) {
            long digit = tempNumber % 10;
            if (digit % 2 != 0) {
                oddDigitSum += digit;
            }
            tempNumber /= 10;
        }

        System.out.println("Sum of odd digits in " + number + ": " + oddDigitSum);

 
    }
}
