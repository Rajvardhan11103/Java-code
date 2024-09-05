/* PS6 :- Write a program in java which takes 3 inputs and print the maximum of all.
 */ 
 
import java.util.Scanner;

class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double max = findMax(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);

 
    }

    // Helper function to find the maximum of three numbers
    private static double findMax(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
