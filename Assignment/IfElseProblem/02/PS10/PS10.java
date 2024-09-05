/* PS10 :- Write a program in java to calculate the sum of first 10 whole number  */ 


class SumOfFirstTenWholeNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum =sum + i;
        }

        System.out.println("Sum of the first 10 whole numbers: " + sum);
    }
}
