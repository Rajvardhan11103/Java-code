/* PS17 :- Write a program in java which take 5 numbers from the user and print the count of digits in 
all five numbers. */ 

import java.util.Scanner;

class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();
            int digitCount = countDigits(number);
            System.out.println("Number of digits: " + digitCount);
        }


    }

    // Helper method to count the digits in a number
    private static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
