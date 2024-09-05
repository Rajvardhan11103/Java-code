/* Removing Elements:
Write a Java program to create a LinkedList of characters. Add five characters to the 
list. Remove the third character from the list and display the remaining eleme */ 

import java.util.LinkedList;

class CharacterListDemo {
    public static void main(String[] args) {
         
        LinkedList<Character> charList = new LinkedList<>();

         
        charList.add('A');
        charList.add('B');
        charList.add('C');
        charList.add('D');
        charList.add('E');

         
        charList.remove(2);

          
        System.out.println("Remaining characters:");
        for (Character ch : charList) {
            System.out.println(ch);
        }
    }
}
