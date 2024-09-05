/* PS3 :- Write a program in java to print first 10 three digit number.
 */ 
 
 class FirstTenThreeDigitNumbers {
    public static void main(String[] args) {
        printFirstTenThreeDigitNumbers();
    }

    // Function to print the first 10 three-digit numbers
    public static void printFirstTenThreeDigitNumbers() {
        for (int i = 100; i <= 109; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a newline after the numbers
    }
}
