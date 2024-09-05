/* 4. Removing Elements:
Write a Java program to create a Stack of characters. Push five characters onto the stack. Pop 
the top character from the stack and display the remaining elements.
 */ 
 import java.util.Stack;

class CharStackExample {
    public static void main(String[] args) {
       
        Stack<Character> charStack = new Stack<>();

        
        charStack.push('A');
        charStack.push('B');
        charStack.push('C');
        charStack.push('D');
        charStack.push('E');

         
        char poppedChar = charStack.pop();
        System.out.println("Popped character: " + poppedChar);

         
        System.out.println("Remaining elements in the stack:");
        System.out.println(charStack);
    }
}
