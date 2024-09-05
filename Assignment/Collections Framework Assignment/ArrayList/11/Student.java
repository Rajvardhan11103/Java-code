/* 11. Student Management System:
Write a Java program to create an ArrayList of Student objects. Each Student object 
should have properties such as id, name, and grade. Add five students to the list and 
display their details */ 

import java.util.ArrayList;

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
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }
}


class StudentManagementSystem {
    public static void main(String[] args) {
         
        ArrayList<Student> students = new ArrayList<>();

        
        students.add(new Student(1, "Raj", 85.5));
        students.add(new Student(2, "Shubham", 90.0));
        students.add(new Student(3, "Sujal", 78.0));
        students.add(new Student(4, "Roshan", 92.5));
        students.add(new Student(5, "Prathamesh", 88.0));

         
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
