/* PS11 :- Write a program in java to print series of prime number from the entered range from the 
user, take starting and ending number from user.
 */ 
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrimeNumberSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the starting number: ");
        int start = Integer.parseInt(reader.readLine());

        System.out.print("Enter the ending number: ");
        int end = Integer.parseInt(reader.readLine());

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

    }

    // Helper method to check if a number is prime
     static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
