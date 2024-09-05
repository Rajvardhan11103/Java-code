/* PS5 :- Write a program in java to calculate the sum of the even digits of the number. */ 

import java.util.Scanner;

class SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        int sum = calculateSumOfEvenDigits(number);
        System.out.println("Sum of even digits: " + sum);

        scanner.close();
    }

    // Function to calculate the sum of even digits
    public static int calculateSumOfEvenDigits(long num) {
        int sum = 0;
        while (num > 0) {
            int digit = (int) (num % 10);
            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            num = num /  10;
        }
        return sum;
    }
}
