/* PS4 :- Write a program in java to print even numbers from 1 to 100.
 */ 
 
 class EvenNumbersPrinter {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}
