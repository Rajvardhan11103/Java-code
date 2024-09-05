/* PS13 :- Write a program in java to calculate the product of first 10 whole number. */ 

class ProductOfFirstTenWholeNumbers {
    public static void main(String[] args) {
        long product = 1; // Initialize product to 1

        for (int i = 1; i <= 10; i++) {
            product =product* i; // Multiply each number from 1 to 10
        }

        System.out.println("Product of the first 10 whole numbers: " + product);
    }
}
