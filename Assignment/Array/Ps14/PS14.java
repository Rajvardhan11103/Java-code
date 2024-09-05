/* PS14 :- Write a program in java to takes two user defined arrays and print the common elements in 
both the arrays */ 

import java.util.Scanner;

class CommonElementsWithoutHashSet {

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

        // Find common elements
        System.out.println("Common elements in both arrays:");
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                    break; // No need to check further for this element
                }
            }
        }

 
    }
}
