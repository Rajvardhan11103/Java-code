/* 11. Student Management System:
Write a Java program to create a LinkedList of Student objects. Each Student object 
should have properties such as id, name, and grade. Add five students to the list and 
display their details. */ 

import java.util.LinkedList;

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
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", grade=" + grade + '}';
    }
}

class StudentManagementSystem {
    public static void main(String[] args) {
        // Create a LinkedList to store Student objects
        LinkedList<Student> studentList = new LinkedList<>();

        // Add five students to the list
        studentList.add(new Student(101, "Raj", 85.5));
        studentList.add(new Student(102, "sujal", 78.0));
        studentList.add(new Student(103, "Roshan", 92.3));
        studentList.add(new Student(104, "Shubham", 70.8));
        studentList.add(new Student(105, "prathamesh", 88.2));

        // Display student details
        System.out.println("Student Details:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
