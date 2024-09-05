/* PS8 :- Write a program in java to calculate sum of the all even number and product of the odd 
numbers from 1 to 10*/

class EvenSumAndOddProduct {
    public static void main(String[] args) {
        int evenSum = 0;
        long oddProduct = 1;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenSum =evenSum+ i; // Add even numbers to the sum
            } else {
                oddProduct =oddProduct* i; // Multiply odd numbers to the product
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Product of odd numbers: " + oddProduct);
    }
}

