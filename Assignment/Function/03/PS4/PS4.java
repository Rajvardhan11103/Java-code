/* PS4 :- Write a program in java to print even numbers from 1 to 100 */ 
class EvenNumbers {
    public static void main(String[] args) {
        printEvenNumbers();
    }

    // Function to print even numbers from 1 to 100
    public static void printEvenNumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a newline after the numbers
    }
}
