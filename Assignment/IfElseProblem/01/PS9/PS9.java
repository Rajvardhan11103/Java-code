/* PS9 :- Write a program in java which takes integer n, if the number is even print in descending 
order, if the number id odd print odd numbers in descending order(example :- i/p = 6, o/p = 6 5 4 
3 2 1, i/p = 5, o/p = 5 3 1) */ 

import java.util.Scanner;

class DescendingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            // Even number: Print in descending order
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
        } else {
            // Odd number: Print odd numbers in descending order
            for (int i = n; i >= 1; i -= 2) {
                System.out.print(i + " ");
            }
        }
 
    }
}
