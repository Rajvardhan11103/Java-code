/* 3. Updating Values:
Write a Java program to create a LinkedHashMap of String keys and Integer values 
representing student names and their scores. Add five student-score pairs to the map. 
Update the score for a specific student and display the updated map.
 */ 
 
 import java.util.LinkedHashMap;
import java.util.Map;

class StudentScores {
    public static void main(String[] args) {
        // Create a LinkedHashMap to store student names and scores
        Map<String, Integer> studentScores = new LinkedHashMap<>();

        // Add five student-score pairs
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 88);
        studentScores.put("Eve", 95);

         
        String studentToUpdate = "Bob";
        int newScore = 96;
        studentScores.put(studentToUpdate, newScore);

        // Display the updated map
        System.out.println("Updated student scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
