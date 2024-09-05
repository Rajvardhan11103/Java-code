/* 3. Updating Elements:
Write a Java program to create an ArrayList of double values. Add five different values 
to the list. Replace the second value with a new value and display the updated list.
 */ 
 import java.util.ArrayList;

class UpdateDoubleList {
    public static void main(String[] args) {
         
        ArrayList<Double> values = new ArrayList<>();

       
        values.add(1.1);
        values.add(2.2);
        values.add(3.3);
        values.add(4.4);
        values.add(5.5);

       
        System.out.println("Original list: " + values);

        
        values.set(1, 9.9);  

         
        System.out.println("Updated list: " + values);
    }
}
