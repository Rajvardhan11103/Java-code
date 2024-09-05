/* PS12:- Write a program in java to calculate the product of the first 10 natural number. */ 

class ProductOfFirstTenNaturalNumbers {
    public static void main(String[] args) {
        int product = 1; // Initialize product to 1

        for (int i = 1; i <= 10; i++) {
            product =product*i; // Multiply each number from 1 to 10
        }

        System.out.println("Product of the first 10 natural numbers: " + product);
    }
}
