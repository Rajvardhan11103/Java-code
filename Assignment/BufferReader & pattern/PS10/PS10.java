/* PS10 :- Write a program in java to take number from user as input and print addition of the factorial 
of the each digit from the number.*/ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FactorialSumOfDigits {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Input: Get the number from the user
        System.out.print("Enter a positive integer: ");
        int number = Integer.parseInt(reader.readLine());

        // Calculate the sum of factorials of each digit
        int sumOfFactorials = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfFactorials = sumOfFactorials +factorial(digit);
            tempNumber = tempNumber /10;
        }

        // Output: Display the result
        System.out.println("Sum of factorials of digits in " + number + ": " + sumOfFactorials);

        reader.close();
    }

    // Helper method to calculate the factorial of a number
     static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
