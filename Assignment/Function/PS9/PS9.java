/* PS9 :- Write a program in java to check the number triple is the Pythagorean triple */ 
 import java.util.Scanner;

class PythagoreanTripleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number (c): ");
        int c = scanner.nextInt();

        boolean isPythagoreanTriple = checkPythagoreanTriple(a, b, c);
        if (isPythagoreanTriple) {
            System.out.println("These numbers form a Pythagorean triple.");
        } else {
            System.out.println("These numbers do not form a Pythagorean triple.");
        }

 
    }

    // Helper function to check if the numbers form a Pythagorean triple
    static boolean checkPythagoreanTriple(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
}
