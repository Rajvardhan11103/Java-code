/* PS15 :- Write a program in java to take two user defined arrays and make a new array having the 
elements of both arrays.(merge two arrays) */ 

import java.util.Scanner;

class MergeArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        // Input: First array elements
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input: Size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        // Input: Second array elements
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Create a new array to store merged elements
        int mergedSize = size1 + size2;
        int[] mergedArray = new int[mergedSize];

        // Copy elements from the first array
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = arr2[i];
        }

        // Output: Merged array
        System.out.println("Merged array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
 
    }
}
