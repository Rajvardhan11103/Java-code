/* 2. Accessing Elements:
Write a Java program to create a Vector of integers. Add the first ten natural numbers to the 
vector. Then, print the third element of the vector. */ 

import java.util.Vector;

class NaturalNumberVectorExample {
    public static void main(String[] args) {
         
        Vector<Integer> naturalNumberVector = new Vector<>();

        
        for (int i = 1; i <= 10; i++) {
            naturalNumberVector.add(i);
        }

        
        if (naturalNumberVector.size() >= 3) {
            int thirdElement = naturalNumberVector.get(2);
            System.out.println("Third element: " + thirdElement);
        } else {
            System.out.println("Vector does not have enough elements.");
        }
    }
}
