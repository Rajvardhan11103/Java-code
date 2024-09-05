/* 2. Sorting Employees by Salary:
Write a Java program to create an Employee class with properties id, name, and salary. 
Implement the Comparable interface to sort employees by their salaries in descending 
order. Create a LinkedList of Employee objects, add five employees to the list, and 
display the sorted list. */ 

import java.util.LinkedList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        // Compare employees based on their salaries (in descending order)
        return Double.compare(otherEmployee.salary, this.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +"id=" + id +", name='" + name + '\'' +", salary=" + salary +'}';
    }
}

class EmployeeSalarySorting {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(101, "Alice", 75000.0));
        employeeList.add(new Employee(102, "Bob", 80000.0));
        employeeList.add(new Employee(103, "Charlie", 90000.0));
        employeeList.add(new Employee(104, "David", 72000.0));
        employeeList.add(new Employee(105, "Eve", 85000.0));

        // Sort the employees by salary (descending order)
        Collections.sort(employeeList);

        System.out.println("Sorted Employee List (by salary, descending order):");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
