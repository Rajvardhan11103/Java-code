/* 11. Student Management System:
Write a Java program to create a Stack of Student objects. Each Student object should have 
properties such as id, name, and grade. Push five students onto the stack and display their 
details. */ 

import java.util.Stack;

class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +"id=" + id + ", name='" + name + '\''+ ", grade=" + grade +'}';
    }
}

class StudentManagementSystem {
    public static void main(String[] args) {
         
        Stack<Student> studentStack = new Stack<>();

        
        studentStack.push(new Student(101, "Alice", 85.5));
        studentStack.push(new Student(102, "Bob", 78.0));
        studentStack.push(new Student(103, "Charlie", 92.3));
        studentStack.push(new Student(104, "David", 70.8));
        studentStack.push(new Student(105, "Eve", 88.2));

        
        System.out.println("Details of students in the stack:");
        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }
    }
}
