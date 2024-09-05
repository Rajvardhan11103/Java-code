/* 15. Task Management:
Write a Java program to create a TreeSet of String values where each string represents a 
task. Add tasks to the set, ensuring no duplicates. Display the tasks in alphabetical 
order. */ 

import java.util.Set;
import java.util.TreeSet;

class TaskManager {
    public static void main(String[] args) {
        // Create a TreeSet to store tasks
        Set<String> taskSet = new TreeSet<>();

        // Add tasks (ensuring uniqueness)
        taskSet.add("Write report");
        taskSet.add("Review code");
        taskSet.add("Prepare presentation");
        taskSet.add("Test application");
        taskSet.add("Write report"); // Duplicate (will be ignored)

        // Display tasks in alphabetical order
        System.out.println("Tasks in alphabetical order:");
        for (String task : taskSet) {
            System.out.println(task);
        }
    }
}
