/*  2. Sorting Students by Grade and Name:
o Write a Java program to create a Student class with properties id, name, and grade. 
Implement two Comparator classes:
1. ByGradeComparator: Sort students by their grades in ascending order.
2. ByNameComparator: Sort students by their names in alphabetical order.
o Create a TreeSet of Student objects with a custom comparator to sort students by 
grade. Add five students to the set and display them.
o Modify the TreeSet to use the ByNameComparator and display the students sorted by 
name.

*/

import java.util.*;

class Student {
    private int id;
    private String name;
    private int grade;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ") - Grade: " + grade;
    }
}

class ByGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getGrade(), s2.getGrade());
    }
}

class ByNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class StudentSortingExample {
    public static void main(String[] args) {
        Set<Student> studentsByGrade = new TreeSet<>(new ByGradeComparator());
        studentsByGrade.add(new Student(101, "Alice", 85));
        studentsByGrade.add(new Student(102, "Bob", 92));
        studentsByGrade.add(new Student(103, "Charlie", 78));
        studentsByGrade.add(new Student(104, "David", 88));
        studentsByGrade.add(new Student(105, "Eva", 95));

        System.out.println("Students sorted by grade:");
        for (Student student : studentsByGrade) {
            System.out.println(student);
        }

        Set<Student> studentsByName = new TreeSet<>(new ByNameComparator());
        studentsByName.addAll(studentsByGrade); // Reuse the existing students

        System.out.println("\nStudents sorted by name:");
        for (Student student : studentsByName) {
            System.out.println(student);
        }
    }
}
