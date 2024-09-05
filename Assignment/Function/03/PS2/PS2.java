/* PS2 :- Write a program in java to print the first 10 numbers. */ 

class FirstTenNumbers {
    public static void main(String[] args) {
        printFirstTenNumbers();
    }

    // Function to print the first 10 numbers
    public static void printFirstTenNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a newline after the numbers
    }
}
