/* PS17 :- Write a program in java which has user defined array, print the count of all the digits in the 
array (total number of elements in the array). */

import java.util.Scanner;

class CountDigitsInArray {

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

        // Count the total number of digits
        int totalDigits = 0;
        for (int num : arr) {
            totalDigits += countDigits(num);
        }

        // Output: Total number of digits
        System.out.println("Total number of digits in the array: " + totalDigits);

        scanner.close();
    }

    // Helper method to count the digits in a number
    private static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num /10;
            count++;
        }
        return count;
    }
}
