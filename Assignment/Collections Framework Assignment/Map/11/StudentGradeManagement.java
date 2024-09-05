/* 11. Student Grade Management:
Write a Java program to create a HashMap of String keys and ArrayList<Integer> values 
where the keys are student names and the values are lists of their grades. Add grades 
for five students. Provide functionality to calculate and display the average grade for 
each student.
 */ 
 
 import java.util.*;

public class StudentGradeManagement {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, ArrayList<Integer>> studentGrades = new HashMap<>();

        // Add grades for five students
        studentGrades.put("Alice", new ArrayList<>(Arrays.asList(85, 90, 78, 92, 88)));
        studentGrades.put("Bob", new ArrayList<>(Arrays.asList(75, 82, 70, 88, 91)));
        studentGrades.put("Carol", new ArrayList<>(Arrays.asList(92, 88, 95, 89, 93)));
        studentGrades.put("David", new ArrayList<>(Arrays.asList(80, 85, 88, 76, 84)));
        studentGrades.put("Eve", new ArrayList<>(Arrays.asList(95, 98, 92, 96, 91)));

        // Calculate and display average grade for each student
        for (Map.Entry<String, ArrayList<Integer>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            ArrayList<Integer> grades = entry.getValue();

            double averageGrade = calculateAverage(grades);
            System.out.println(studentName + "'s average grade: " + averageGrade);
        }
    }

    // Helper method to calculate average grade
    private static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return (double) sum / grades.size();
    }
}
