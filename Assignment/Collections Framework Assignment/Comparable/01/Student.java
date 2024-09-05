/* 1. Sorting Students by Grade:
Write a Java program to create a Student class with properties id, name, and grade. 
Implement the Comparable interface to sort students by their grades in ascending order. 
Create an ArrayList of Student objects, add five students to the list, and display the 
sorted list.
 */ 
 import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student otherStudent) {
        // Compare students based on their grades
        return Double.compare(this.grade, otherStudent.grade);
    }

    @Override
    public String toString() {
        return "Student{" +"id=" + id +", name='" + name + '\'' +", grade=" + grade +'}';
    }
}

class StudentGradeSorting {
    public static void main(String[] args) {
        // Create an ArrayList of Student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Add five students
        studentList.add(new Student(101, "Alice", 85.5));
        studentList.add(new Student(102, "Bob", 78.0));
        studentList.add(new Student(103, "Charlie", 92.3));
        studentList.add(new Student(104, "David", 70.8));
        studentList.add(new Student(105, "Eve", 88.2));

        // Sort the students by grade (ascending order)
        Collections.sort(studentList);

        // Display the sorted student list
        System.out.println("Sorted Student List (by grade):");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
