/* PS14 :- Write a program in java which take user defines range as input and print the perfect number 
from the range. */ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PerfectNumberPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the starting number: ");
        int start = Integer.parseInt(reader.readLine());

        System.out.print("Enter the ending number: ");
        int end = Integer.parseInt(reader.readLine());

        System.out.println("Perfect numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
            }
        }

 
    }

    // Helper method to check if a number is perfect
    static boolean isPerfect(int n) {
        int sumOfDivisors = 1; // Start with 1 (since every number is divisible by 1)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sumOfDivisors = sumOfDivisors +i;
                if (i != n / i) {
                    sumOfDivisors = sumOfDivisors + n / i;
                }
            }
        }
        return sumOfDivisors == n;
    }
}
