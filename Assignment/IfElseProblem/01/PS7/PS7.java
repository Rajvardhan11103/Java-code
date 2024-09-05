/* PS7 :- Write a program in java to calculate sum of the digits at the even places in the number. */ 

import java.util.Scanner;

class SumOfDigitsAtEvenPlaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        int sum = calculateSumOfDigitsAtEvenPlaces(number);
        System.out.println("Sum of digits at even places: " + sum);

 
    }

    // Function to calculate the sum of digits at even places
    public static int calculateSumOfDigitsAtEvenPlaces(long num) {
        String numString = Long.toString(num);
        int sum = 0;

        for (int i = 1; i < numString.length(); i += 2) {
            int digit = Character.getNumericValue(numString.charAt(i));
            sum =sum + digit;
        }

        return sum;
    }
}
