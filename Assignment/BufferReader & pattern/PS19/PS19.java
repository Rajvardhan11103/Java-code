/* PS19 :- Write a program in java which take user defines range as input and print Armstrong number 
from the range. */ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArmstrongNumberPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the starting number: ");
        int start = Integer.parseInt(reader.readLine());

        System.out.print("Enter the ending number: ");
        int end = Integer.parseInt(reader.readLine());

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }

 
    }

    // Helper method to check if a number is an Armstrong number
    private static boolean isArmstrong(int n) {
        int original = n;
        int numDigits = countDigits(n);
        int sum = 0;

        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            int digitPower = 1;
            for (int i = 0; i < numDigits; i++) {
                digitPower = digitPower*digit;
            }
            sum = sum + digitPower;
            temp = temp / 10;
        }

        return sum == original;
    }

    // Helper method to count the digits in a number
    private static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}

