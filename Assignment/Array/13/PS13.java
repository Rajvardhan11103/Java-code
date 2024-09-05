/* PS13 :- Write a program in java to print the index of the largest number in the array.(array takes 
value from user).
*/ 

import java.util.Scanner;

class LargestNumberIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input: Array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the index of the largest number
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // Output: Index of the largest number
        System.out.println("Index of the largest number: " + maxIndex);

        scanner.close();
    }
}
