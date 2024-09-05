/* 2. Removing Elements:
Write a Java program to create a LinkedHashSet of Character values representing 
different characters. Add ten different characters to the set. Remove a specific 
character and display the remaining elements in the set. */ 

import java.util.LinkedHashSet;
import java.util.Set;

class CharacterSetExample {
    public static void main(String[] args) {
         
        Set<Character> charSet = new LinkedHashSet<>();

         
        charSet.add('A');
        charSet.add('B');
        charSet.add('C');
        charSet.add('D');
        charSet.add('E');
        charSet.add('F');
        charSet.add('G');
        charSet.add('H');
        charSet.add('I');
        charSet.add('J');

         
        char targetChar = 'D';
        charSet.remove(targetChar);

        
        System.out.println("Remaining characters in the set:");
        for (Character ch : charSet) {
            System.out.print(ch + " ");
        }
    }
}

