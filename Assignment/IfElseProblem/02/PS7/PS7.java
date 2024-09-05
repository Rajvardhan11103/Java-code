/* PS7 :- Write a program in java table of 12 */ 


class MultiplicationTableOfTwelve {
    public static void main(String[] args) {
        int number = 12;
        int limit = 10; // You can change this to print a different number of rows

        System.out.println("Multiplication table of " + number + ":");

        for (int i = 1; i <= limit; i++) {
            int result = number * i;
            System.out.println(number + " × " + i + " = " + result);
        }
    }
}
