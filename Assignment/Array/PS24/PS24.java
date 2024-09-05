/* PS24 :- Write a program in java which has user defined array, print the Armstrong number in the 
array along with their indices.(a number that is equal to the sum of cubes of its digits.)
 */
 import java.util.Scanner;

class ArmstrongNumbers {

    // Helper method to calculate the cube of a number
    private static int cube(int num) {
        return num * num * num;
    }

    // Helper method to check if a number is an Armstrong number
    private static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sumOfCubes = 0;
        while (num > 0) {
            int digit = num % 10;
            sumOfCubes += cube(digit);
            num /= 10;
        }
        return sumOfCubes == originalNum;
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

        // Check and print indices of Armstrong numbers
        System.out.println("Indices of Armstrong numbers:");
        for (int i = 0; i < size; i++) {
            if (isArmstrongNumber(arr[i])) {
                System.out.println("Element " + arr[i] + " at index " + i);
            }
        }

    }
}
