/* 4. Removing Elements:
Write a Java program to create a Vector of characters. Add five characters to the vector. 
Remove the third character from the vector and display the remaining elements */ 

import java.util.Vector;

class CharacterVectorExample {
    public static void main(String[] args) {
         
        Vector<Character> charVector = new Vector<>();

         
        charVector.add('A');
        charVector.add('B');
        charVector.add('C');
        charVector.add('D');
        charVector.add('E');

        // Remove the third character (index 2)
        if (charVector.size() >= 3) {
            charVector.remove(2);
        } else {
            System.out.println("Vector does not have enough elements.");
        }

        
        System.out.println("Remaining elements in the vector:");
        for (char ch : charVector) {
            System.out.print(ch + " ");
        }
    }
}
