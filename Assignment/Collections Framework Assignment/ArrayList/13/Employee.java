/* 13. Employee Management System:
Write a Java program to create an ArrayList of Employee objects. Each Employee object 
should have properties such as id, name, and department. Add five employees to the list 
and provide functionality to remove an employee by their id. */ 

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Def", "HR"));
        employees.add(new Employee(2, "Bcd", "IT"));
        employees.add(new Employee(3, "Cde", "Finance"));
        employees.add(new Employee(4, "Efg", "Marketing"));
        employees.add(new Employee(5, "abc", "Sales"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID of employee to remove: ");
        int idToRemove = scanner.nextInt();

        boolean removed = removeEmployeeById(employees, idToRemove);
        if (removed) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("Current list of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static boolean removeEmployeeById(ArrayList<Employee> employees, int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                return true;
            }
        }
        return false;
    }
}
