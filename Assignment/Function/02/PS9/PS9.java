/* PS9 :- Write a program in java which takes integer n, if the number is even print in descending 
order, if the number id odd print odd numbers in descending order(example :- i/p = 6, o/p = 6 5 4 
3 2 1, i/p = 5, o/p = 5 3 1) */ 

import java.util.Scanner;

class NumberSequencePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            // If even, print in descending order
            printDescendingEvenNumbers(n);
        } else {
            // If odd, print odd numbers in descending order
            printDescendingOddNumbers(n);
        }
    }

    // Function to print even numbers in descending order
    static void printDescendingEvenNumbers(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a newline
    }

    // Function to print odd numbers in descending order
    static void printDescendingOddNumbers(int n) {
        for (int i = n; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a newline
    }
}
