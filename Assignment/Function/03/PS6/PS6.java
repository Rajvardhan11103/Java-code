/* PS6 :- Write a program in java to print reverse from 100 t0 1.
 */ 
 class OddNumbers {
    public static void main(String[] args) {
        printOddNumbers();
    }

    // Function to print odd numbers from 1 to 50
    public static void printOddNumbers() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a newline after the numbers
    }
}

 
 