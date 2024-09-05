/* PS1 :- Write a program in java to print table of 2. */ 

class MultiplicationTable {
    // Function to print the table of 2
    public static void printTableOf2() {
        for (int i = 1; i <= 10; i++) {
            int result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        // Call the function to print the table
        printTableOf2();
    }
}

