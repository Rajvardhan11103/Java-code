/* 5. Checking Existence:
Write a Java program to create a TreeMap of Integer keys and String values representing 
employee IDs and their names. Add five employee-ID pairs to the map. Check if a 
specific ID exists in the map and display the result. */ 

import java.util.TreeMap;

public class EmployeeIDs {
    public static void main(String[] args) {
         
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

         
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "David");
        employeeMap.put(105, "Eve");

        
        int idToCheck = 103;
        boolean exists = employeeMap.containsKey(idToCheck);

        // Display the result
        if (exists) {
            System.out.println("Employee with ID " + idToCheck + " exists.");
        } else {
            System.out.println("Employee with ID " + idToCheck + " does not exist.");
        }
    }
}
