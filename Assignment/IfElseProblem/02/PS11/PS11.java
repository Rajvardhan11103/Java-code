/* PS11 :- Write a program in java which take any natural number, consider its negative and print sum of 
two. */ 


import java.util.Scanner;

class SumOfNaturalAndNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int naturalNumber = scanner.nextInt();

        // Calculate the negative of the natural number
        int negativeNumber = -naturalNumber;

        // Calculate the sum
        int sum = naturalNumber + negativeNumber;

        System.out.println("Negative of " + naturalNumber + " is " + negativeNumber);
        System.out.println("Sum of " + naturalNumber + " and " + negativeNumber + " is " + sum);
 
    }
}
