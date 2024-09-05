/* PS16 :- Write a program in java which take user defines range as input and print perfect squares 
from the range. */ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PerfectSquaresPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the starting number: ");
        int start = Integer.parseInt(reader.readLine());

        System.out.print("Enter the ending number: ");
        int end = Integer.parseInt(reader.readLine());

        System.out.println("Perfect squares between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPerfectSquare(num)) {
                System.out.print(num + " ");
            }
        }

   
    }

    // Helper method to check if a number is a perfect square
    static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
