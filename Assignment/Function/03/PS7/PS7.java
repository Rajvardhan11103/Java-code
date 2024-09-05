/* PS7 :- Write a program in java table of 12. */ 

class MultiplicationTable {
    public static void main(String[] args) {
        int number = 12;
        printMultiplicationTable(number);
    }

    // Function to print the multiplication table for a given number
    public static void printMultiplicationTable(int num) {
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " × " + i + " = " + product);
        }
    }
}
