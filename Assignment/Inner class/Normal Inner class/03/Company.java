/* Scenario 3: Employee Management System
Problem Statement: You are developing an Employee Management System in Java. Each 
employee has basic details such as name, age, and salary. Implement the system using an outer 
class for the company and an inner class for employees.
Requirements:
1. Company Class (Outer Class):
o Maintain a list of employees in the company.
o Provide methods to add an employee, remove an employee by name, and find an 
employee by name.
2. Employee Class (Inner Class):
o Define an inner class Employee within Company to represent each employee.
o Each Employee should have properties like name, age, salary, and any other relevant 
details.
o Implement methods in Employee class to get and set these properties.
3. Testing:
o Create instances of Company in a main class.
o Use methods of Company to add employees, remove employees, and find 
employees by name.
o Demonstrate the use of inner class Employee by accessing and modifying employee 
properties. */ 

import java.util.ArrayList;
import java.util.List;

class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    // Inner class representing an employee
    private class Employee {
        private String name;
        private int age;
        private double salary;

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        // Getters and setters for employee properties
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    // Add an employee to the company
    public void addEmployee(String name, int age, double salary) {
        Employee newEmployee = new Employee(name, age, salary);
        employees.add(newEmployee);
    }

    // Remove an employee by name
    public void removeEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
    }

    // Find an employee by name
    public Employee findEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    public static void main(String[] args) {
        Company myCompany = new Company();

        // Add employees
        myCompany.addEmployee("Alice", 30, 50000.0);
        myCompany.addEmployee("Bob", 28, 60000.0);

        // Modify salary
        Employee alice = myCompany.findEmployeeByName("Alice");
        if (alice != null) {
            alice.setSalary(55000.0);
        }

        // Remove an employee
        myCompany.removeEmployee("Bob");

        // Display employee details
        System.out.println("Employee Details:");
        for (Employee employee : myCompany.employees) {
            System.out.println("Name: " + employee.getName() +", Age: " + employee.getAge() +", Salary: $" + employee.getSalary());
        }
    }
}
