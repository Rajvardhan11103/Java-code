/* ArrayIndexOutOfBoundsException
4. Problem Statement:
o Write a program that initializes an array of integers and attempts to access an 
element at an invalid index. Handle the ArrayIndexOutOfBoundsException and print an 
appropriate message.
 */
 
 class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempt to access an element at an invalid index
            int invalidElement = numbers[10];
            System.out.println("Element at index 10: " + invalidElement);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("Error: Attempted to access an invalid index. Please ensure the index is within the valid range.");
        }
    }
}
