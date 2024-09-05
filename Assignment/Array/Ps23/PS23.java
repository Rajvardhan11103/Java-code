/* PS23 :- Write a program in java which has user defined array, print the strong number in the array 
along with their indices.(a positive integer whose sum of factorials of its digits equals the number 
itself)
 */
 
 import java.util.Scanner;

class StrongNumbers {

    // Helper method to calculate the factorial of a number
    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Helper method to check if a number is a strong number
    private static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;
        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }
        return sumOfFactorials == originalNum;
    }

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

        // Check and print indices of strong numbers
        System.out.println("Indices of strong numbers:");
        for (int i = 0; i < size; i++) {
            if (isStrongNumber(arr[i])) {
                System.out.println("Element " + arr[i] + " at index " + i);
            }
        }

    }
}
