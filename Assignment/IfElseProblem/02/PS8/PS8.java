/* PS8 :- Write a program in java table of 12 in reverse. */ 

class ReverseMultiplicationTableOfTwelve {
    public static void main(String[] args) {
        int number = 12;

        System.out.println("Reverse multiplication table of " + number + ":");

        for (int i = 10; i >= 1; i--) {
            int result = number * i;
            System.out.println(number + " × " + i + " = " + result);
        }
    }
}
