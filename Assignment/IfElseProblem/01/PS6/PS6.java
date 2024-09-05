/* PS6 :- Write a program in java to calculate sum of the digits at the odd places in the number */ 

import java.util.Scanner;

class SumOfDigitsAtOddPlaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        int sum = calculateSumOfDigitsAtOddPlaces(number);
        System.out.println("Sum of digits at odd places: " + sum);

        scanner.close();
    }

    // Function to calculate the sum of digits at odd places
    public static int calculateSumOfDigitsAtOddPlaces(long num) {
        String numString = Long.toString(num);
        int sum = 0;

        for (int i = 0; i < numString.length(); i++) {
            if (i % 2 == 0) { // Check if the position is odd
                int digit = Character.getNumericValue(numString.charAt(i));
                sum = sum + digit;
            }
        }

        return sum;
    }
}
