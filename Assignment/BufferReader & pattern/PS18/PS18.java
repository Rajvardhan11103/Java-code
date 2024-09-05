/* PS18 :- Write a program in java which take user defines range as input and print palindrome number 
from the range. */ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PalindromeNumberPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the starting number: ");
        int start = Integer.parseInt(reader.readLine());

        System.out.print("Enter the ending number: ");
        int end = Integer.parseInt(reader.readLine());

        System.out.println("Palindrome numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPalindrome(num)) {
                System.out.print(num + " ");
            }
        }


    }

    // Helper method to check if a number is a palindrome
    static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n /10;
        }
        return original == reversed;
    }
}
