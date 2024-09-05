/* PS9 :- Write a program in java to calculate the sum of first 10 natural number.
*/
class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n = 10; // Number of natural numbers
        int sum = calculateSum(n);
        System.out.println("Sum of the first " + n + " natural numbers: " + sum);
    }

    // Function to calculate the sum of the first n natural numbers
    public static int calculateSum(int n) {
        return n * (n + 1) / 2;
    }
}
