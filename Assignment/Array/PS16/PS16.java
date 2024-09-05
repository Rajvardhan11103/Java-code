/* PS16 :- Write a program in java which has user defined array, print the elements whose sum of digits 
is even.
 */ 
 
 import java.util.Scanner;

class SumOfDigitsEven {

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

        // Check and print elements with even sum of digits
        System.out.println("Elements with an even sum of digits:");
        for (int num : arr) {
            if (sumOfDigitsIsEven(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    // Helper method to check if the sum of digits is even
    private static boolean sumOfDigitsIsEven(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 2 == 0;
    }
}
