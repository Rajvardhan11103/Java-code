/* PS22 :- Write a program in java which has user defined array, print the palindrome number in the 
array along with their indices. */ 

import java.util.Scanner;

class PalindromeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input: Array elements
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check and print indices of palindrome numbers
        System.out.println("Indices of palindrome numbers:");
        for (int i = 0; i < size; i++) {
            if (isPalindrome(arr[i])) {
                System.out.println("Element " + arr[i] + " at index " + i);
            }
        }

        scanner.close();
    }

    // Helper method to check if a number is a palindrome
    private static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return originalNum == reversed;
    }
}
