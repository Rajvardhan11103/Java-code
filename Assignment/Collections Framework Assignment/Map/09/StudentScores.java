/* 9. Merging Two Maps:
Write a Java program to create two HashMap objects. The first map should contain five 
student names and their scores, and the second map should contain additional student 
names and scores. Merge the second map into the first map and display the merged 
map. */ 

import java.util.*;

class StudentScores {
    public static void main(String[] args) {
 
        Map<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Alice", 85);
        studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);
        studentScores1.put("Eve", 88);

        // Create the second HashMap with additional student names and scores
        Map<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Frank", 91);
        studentScores2.put("Grace", 89);
        studentScores2.put("Hannah", 93);

        // Merge the second map into the first map
        studentScores1.putAll(studentScores2);

        System.out.println("Merged student scores:");
		System.out.println(studentScores1);
        System.out.println("  ");
		

    }
}

