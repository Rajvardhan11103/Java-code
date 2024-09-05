/* PS13 :- Write a program in java which take user defines range as input and print the composite 
numbers from the range.
 */ 
 
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CompositeNumberPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the starting number: ");
        int start = Integer.parseInt(reader.readLine());

        System.out.print("Enter the ending number: ");
        int end = Integer.parseInt(reader.readLine());

        System.out.println("Composite numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isComposite(num)) {
                System.out.print(num + " ");
            }
        }

 
    }

    // Helper method to check if a number is composite
    static boolean isComposite(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
