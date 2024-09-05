/* PS4 :- Write a program in java to calculate the sum of the odd digits of the number.
 */ 
 
 import java.util.Scanner;

class SumOfOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        int sum = calculateSumOfOddDigits(number);
        System.out.println("Sum of odd digits: " + sum);

        scanner.close();
    }

    // Function to calculate the sum of odd digits
    public static int calculateSumOfOddDigits(long num) {
        int sum = 0;
        while (num > 0) {
            int digit = (int) (num % 10);
            if (digit % 2 != 0) {
                sum =sum + digit;
            }
            num =num / 10;
        }
        return sum;
    }
}
