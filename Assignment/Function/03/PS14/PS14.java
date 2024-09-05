/* PS14 :- Write a program in java which take any natural number, consider its negative and print
product of two. */

import java.util.Scanner;

class ProductOfNaturalAndNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int naturalNumber = scanner.nextInt();

        // Calculate the negative of the natural number
        int negativeNumber = -naturalNumber;

        // Calculate the product of the natural and negative numbers
        int product = naturalNumber * negativeNumber;

        System.out.println("Natural number: " + naturalNumber);
        System.out.println("Negative number: " + negativeNumber);
        System.out.println("Product of the two: " + product);
 
    }
}
