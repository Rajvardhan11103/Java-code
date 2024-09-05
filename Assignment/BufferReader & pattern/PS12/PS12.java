/* PS12 :- Write a program in java to print the number divisible by 5 from 1 to 50 and count number of 
even numbers. */ 

class DivisibleBy5AndEvenCount {
    public static void main(String[] args) {
        int countEven = 0;

        System.out.println("Numbers divisible by 5 from 1 to 50:");
        for (int num = 1; num <= 50; num++) {
            if (num % 5 == 0) {
                System.out.print(num + " ");
            }
            if (num % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("\nTotal even numbers in the range: " + countEven);
    }
}
