/* PS11 :- Write a program in java to check the given number is palindrome (121 is palindrome) */

import java.util.Scanner;

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

 
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(long num) {
        long originalNumber = num;
        long reversedNumber = 0;

        while (num > 0) {
            long digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num =num/ 10;
        }

        return originalNumber == reversedNumber;
    }
}
