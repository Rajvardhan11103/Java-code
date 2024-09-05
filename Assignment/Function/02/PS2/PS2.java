/* PS2 :- Write a program in java to calculate the factorial of any number.
 */ 
 
 class FactorialCalculator {
    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! and 1! are both 1
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change this to the desired number
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
