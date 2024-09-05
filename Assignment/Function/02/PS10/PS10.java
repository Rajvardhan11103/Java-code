/* PS10 :- Write a program in java to give count down from any number. */ 

import java.util.Scanner;

class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        } else {
            System.out.println("Countdown from " + number + ":");
            for (int i = number; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println(); // Print a newline
        }
    }
}
