/* PS3 :- Write a program in java to count the digits of the given number. */ 

import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }

    // Function to count the digits in a number
    public static int countDigits(long num) {
        if (num == 0) {
            return 1; // Special case for handling 0
        }

        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
