/* Problem 1: Calculator
Description: Create a Calculator class that can perform addition operations on different types and 
numbers of parameters.
Requirements:
1. Implement a method add(int a, int b) to add two integers.
2. Implement a method add(double a, double b) to add two double values.
3. Implement a method add(int a, int b, int c) to add three integers.
4. Implement a method add(int[] numbers) to add an array of integers. */ 

public class Calculator {

   
    public int add(int a, int b) {
        return a + b;
    }

     
    public double add(double a, double b) {
        return a + b;
    }

     
    public int add(int a, int b, int c) {
        return a + b + c;
    }

   
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        
        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + calculator.add(2.5, 3.5));
        System.out.println("Sum of 1, 2, and 3: " + calculator.add(1, 2, 3));
        System.out.println("Sum of array {1, 2, 3, 4, 5}: " + calculator.add(new int[]{1, 2, 3, 4, 5}));
    }
}
