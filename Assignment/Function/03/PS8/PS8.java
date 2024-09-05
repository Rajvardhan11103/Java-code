/* PS8 :- Write a program in java table of 12 in reverse*/ 

class ReverseMultiplicationTable {
    public static void main(String[] args) {
        int number = 12;
        printReverseMultiplicationTable(number);
    }

    // Function to print the multiplication table for a given number in reverse
    public static void printReverseMultiplicationTable(int num) {
        System.out.println("Reverse multiplication table for " + num + ":");
        for (int i = 10; i >= 1; i--) {
            int product = num * i;
            System.out.println(num + " × " + i + " = " + product);
        }
    }
}
