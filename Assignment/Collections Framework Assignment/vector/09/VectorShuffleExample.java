/* 9. Shuffling a Vector:
Write a Java program to create a Vector of integers. Add the first ten natural numbers to the 
vector. Shuffle the vector randomly and display the shuffled vector. */ 

import java.util.Vector;
import java.util.Collections;

class VectorShuffleExample {
    public static void main(String[] args) {
        
        Vector<Integer> naturalNumbersVector = new Vector<>();
        for (int i = 1; i <= 10; i++) {
            naturalNumbersVector.add(i);
        }

        
        Collections.shuffle(naturalNumbersVector);

         
        System.out.println("Shuffled Vector: " + naturalNumbersVector);
    }
}
