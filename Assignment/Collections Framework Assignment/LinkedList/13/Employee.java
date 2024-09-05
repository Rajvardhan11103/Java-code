/* 13. Employee Management System:
Write a Java program to create a LinkedList of Employee objects. Each Employee object 
should have properties such as id, name, and department. Add five employees to the list 
and provide functionality to remove an employee by their id. */ 

import java.util.LinkedList;
import java.util.Iterator;

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
}
class EmployeeManagementSystem {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();

        // Add employees
        employeeList.add(new Employee(101, "John Doe", "Engineering"));
        employeeList.add(new Employee(102, "Jane Smith", "Marketing"));
        employeeList.add(new Employee(103, "Alice Johnson", "HR"));
        employeeList.add(new Employee(104, "Bob Brown", "Finance"));
        employeeList.add(new Employee(105, "Eva Lee", "Operations"));

        // Print the initial list
        System.out.println("Initial employee list:");
        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + " (" + emp.getId() + ") - " + emp.getDepartment());
        }

        // Remove an employee by ID (e.g., remove employee with ID 103)
        int targetId = 103;
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getId() == targetId) {
                iterator.remove();
                break;
            }
        }

        // Print the updated list
        System.out.println("\nEmployee list after removing employee with ID " + targetId + ":");
        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + " (" + emp.getId() + ") - " + emp.getDepartment());
        }
    }
}




