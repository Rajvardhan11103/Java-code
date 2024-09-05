/* PS2 :- Write a program in java to calculate the factorial of any number.
 */ 
 
 import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        scanner.close();
    }

    // Function to calculate the factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result =result *i;
            }
            return result;
        }
    }
}
