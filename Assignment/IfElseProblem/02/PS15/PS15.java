/* PS15 :- Write a program in java to check the Armstrong number. */ 


import java.util.Scanner;

class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        // Calculate the number of digits
        int originalNumber = number;
        int numDigits = 0;
        while (originalNumber != 0) {
            originalNumber = originalNumber/10;
            numDigits++;
        }

        // Compute the sum of digits raised to the power of the number of digits
        int sum = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            int digitPower = 1;
            for (int i = 0; i < numDigits; i++) {
                digitPower =digitPower*digit;
            }
            sum =sum + digitPower;
            originalNumber = originalNumber/10;
        }

        // Check if it's an Armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
