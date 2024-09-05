/* PS5 :- Write a program in java to print odd number from 1 to 50.
 */ 
 
 class OddNumbersPrinter {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 50:");
        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
    }
}
