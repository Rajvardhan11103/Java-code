/* PS21 :- Write a program in java which has user defined array, print the perfect number in the array 
along with their indices.  */ 

import java.util.Scanner;

class PerfectNumbers {

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

        // Check and print indices of perfect numbers
        System.out.println("Indices of perfect numbers:");
        for (int i = 0; i < size; i++) {
            if (isPerfectNumber(arr[i])) {
                System.out.println("Element " + arr[i] + " at index " + i);
            }
        }

        scanner.close();
    }

    // Helper method to check if a number is a perfect number
    private static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false; // Neither prime nor composite
        }
        int sumOfDivisors = 1; // Start with 1 (since 1 is always a divisor)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
                if (i != num / i) {
                    sumOfDivisors = sumOfDivisors + num / i;
                }
            }
        }
        return sumOfDivisors == num;
    }
}
