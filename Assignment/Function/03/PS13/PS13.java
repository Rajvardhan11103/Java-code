/* PS13 :- Write a program in java to calculate the product of first 10 whole number. */ 

class ProductOfFirstTenWholeNumbers {
    public static void main(String[] args) {
        int result = calculateProductOfFirstTenWholeNumbers();
        System.out.println("Product of the first 10 whole numbers: " + result);
    }

    // Function to calculate the product of the first 10 whole numbers
    public static int calculateProductOfFirstTenWholeNumbers() {
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        return product;
    }
}
