/* PS18 :- Write a program in java which has user defined array, print the reverse of each element. */ 

import java.util.Scanner;

class ReverseArrayElements {

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

        // Print reversed elements
        System.out.println("Reversed elements:");
        for (int num : arr) {
            int reversed = reverseNumber(num);
            System.out.print(reversed + " ");
        }

        scanner.close();
    }

    // Helper method to reverse the digits of a number
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }
        return reversed;
    }
}
