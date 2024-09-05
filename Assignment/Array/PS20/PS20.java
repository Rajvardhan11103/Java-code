/* PS20 :- Write a program in java which has user defined array, print the prime number in the array 
along with their indices. */ 

import java.util.Scanner;

class PrimeNumbers {

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

        // Check and print indices of prime numbers
        System.out.println("Indices of prime numbers:");
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                System.out.println("Element " + arr[i] + " at index " + i);
            }
        }

        scanner.close();
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Neither prime nor composite
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Found a divisor other than 1 and itself
            }
        }
        return true; // No divisors other than 1 and itself
    }
}
