/* PS11 :- Write a program in java which take any natural number, consider its negative and print sum of
two. */ 

import java.util.Scanner;

class SumOfNumberAndNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Calculate the negative of the input number
        int negative = -n;

        // Calculate the sum
        int sum = n + negative;

        System.out.println("Original number: " + n);
        System.out.println("Negative of the number: " + negative);
        System.out.println("Sum of the number and its negative: " + sum);
 
    }
}
