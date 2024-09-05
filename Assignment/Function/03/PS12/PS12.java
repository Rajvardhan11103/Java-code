/* PS12:- Write a program in java to calculate the product of the first 10 natural number.
 */ 
 class ProductOfFirstTenNaturalNumbers {
    public static void main(String[] args) {
        int result = calculateProductOfFirstTenNumbers();
        System.out.println("Product of the first 10 natural numbers: " + result);
    }

    // Function to calculate the product of the first 10 natural numbers
    public static int calculateProductOfFirstTenNumbers() {
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        return product;
    }
}

 