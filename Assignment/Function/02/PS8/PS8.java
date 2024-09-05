/* PS8 :- Write a program in java to calculate sum of the all even number and product of the odd 
numbers from 1 to 10. */ 

class EvenOddCalculator {
    public static void main(String[] args) {
        int sumOfEvens = 0;
        long productOfOdds = 1;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // Even number: add to the sum
                sumOfEvens += i;
            } else {
                // Odd number: multiply with the product
                productOfOdds *= i;
            }
        }

        System.out.println("Sum of even numbers from 1 to 10: " + sumOfEvens);
        System.out.println("Product of odd numbers from 1 to 10: " + productOfOdds);
    }
}
