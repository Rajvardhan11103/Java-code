/* PS26 :- Write a program in java which has user defined array, print the second minimum number in 
the array along with its index. */ 

import java.util.Scanner;

class SecondMinNumber {

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

        // Initialize variables
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int secondSmallestIndex = -1;

        // Find the smallest and second smallest numbers
        for (int i = 0; i < size; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
                secondSmallestIndex = i;
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
                secondSmallestIndex = i;
            }
        }

        // Output: Second minimum number and its index
        System.out.println("Second minimum number: " + secondSmallest);
        System.out.println("Index of second minimum: " + secondSmallestIndex);

      
    }
}
