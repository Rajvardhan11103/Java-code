/* 11. Student Management System:
Write a Java program to create a Vector of Student objects. Each Student object should have 
properties such as id, name, and grade. Add five students to the vector and display their details. */ 

import java.util.Vector;

class Student {
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
    public String toString() {
        return "Student{" +
                "id=" + id +", name='" + name + '\'' +", grade=" + grade +'}';
    }
}

class StudentManagementSystem {
    public static void main(String[] args) {
         
        Vector<Student> studentVector = new Vector<>();

        
        studentVector.add(new Student(101, "Alice", 85.5));
        studentVector.add(new Student(102, "Bob", 78.0));
        studentVector.add(new Student(103, "Charlie", 92.3));
        studentVector.add(new Student(104, "David", 70.8));
        studentVector.add(new Student(105, "Eve", 88.2));

        
        System.out.println("Student Details:");
        for (Student student : studentVector) {
            System.out.println(student);
        }
    }
}
