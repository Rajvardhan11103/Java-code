/* 4. Removing Elements:
Write a Java program to create an ArrayList of characters. Add five characters to the 
list. Remove the third character from the list and display the remaining elements */ 

import java.util.ArrayList;

class CharacterList {
    public static void main(String[] args) {
        
        ArrayList<Character> characters = new ArrayList<>();

        
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');

       
        System.out.println("Original list: " + characters);

       
        characters.remove(2);

         
        System.out.println("Updated list: " + characters);
    }
}
