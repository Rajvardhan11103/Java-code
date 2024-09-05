/*  Updating Elements:
Write a Java program to create a LinkedList of double values. Add five different values 
to the list. Replace the second value with a new value and display the updated list.
 */ 
 
 import java.util.LinkedList;

class DoubleListDemo {
    public static void main(String[] args) {
         
        LinkedList<Double> doubleList = new LinkedList<>();

         
        doubleList.add(3.14);
        doubleList.add(2.71);
        doubleList.add(1.618);
        doubleList.add(0.707);
        doubleList.add(4.20);

         
        double newValue = 3.33;
        doubleList.set(1, newValue);

        
        System.out.println("Updated list of double values:");
        for (Double value : doubleList) {
            System.out.println(value);
        }
    }
}
