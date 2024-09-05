/* 9. Shuffling an ArrayList:
Write a Java program to create an ArrayList of integers. Add the first ten natural 
numbers to the list. Shuffle the list randomly and display the shuffled list.
 */ 
 
import java.util.ArrayList;
import java.util.Collections;

class ShuffleList {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        
        Collections.shuffle(numbers);

        
        System.out.println("Shuffled list: " + numbers);
    }
}
