/* 3. Updating Elements:
Write a Java program to create a Vector of double values. Add five different values to the 
vector. Replace the second value with a new value and display the updated vector. */ 

import java.util.Vector;

class DoubleVectorExample {
    public static void main(String[] args) {
        
        Vector<Double> doubleVector = new Vector<>();

         
        doubleVector.add(10.5);
        doubleVector.add(20.3);
        doubleVector.add(15.7);
        doubleVector.add(8.2);
        doubleVector.add(12.9);

         
        double newSecondValue = 18.0;
        doubleVector.set(1, newSecondValue);

        
        System.out.println("Updated vector of double values:");
        for (double value : doubleVector) {
            System.out.println(value);
        }
    }
}
