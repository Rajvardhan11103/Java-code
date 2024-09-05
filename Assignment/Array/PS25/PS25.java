/* PS25 :- Write a program in java which has user defined array, print the second maximum number in 
the array along with its index. */ 

import java.util.Scanner;

class SecondMaxNumber {

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

        // Initialize max and secondMax variables
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int secondMaxIndex = -1;

        // Find the maximum and second maximum numbers
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
                secondMaxIndex = i;
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
                secondMaxIndex = i;
            }
        }

        // Output: Second maximum number and its index
        System.out.println("Second maximum number: " + secondMax);
        System.out.println("Index of second maximum: " + secondMaxIndex);

        scanner.close();
    }
}
