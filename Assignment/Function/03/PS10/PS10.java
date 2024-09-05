/* PS10 :- Write a program in java to calculate the sum of first 10 whole number. */ 

class SumOfFirstWholeNumbers {
    public static void main(String[] args) {
        int n = 10; // Number of whole numbers
        int sum = calculateSum(n);
        System.out.println("Sum of the first " + n + " whole numbers: " + sum);
    }

    // Function to calculate the sum of the first n whole numbers
    public static int calculateSum(int n) {
        return n * (n + 1) / 2;
    }
}
