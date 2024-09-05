/* 13. Employee Management System:
Write a Java program to create a Vector of Employee objects. Each Employee object should 
have properties such as id, name, and department. Add five employees to the vector and 
provide functionality to remove an employee by their id. */ 

import java.util.Vector;

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
        return "Employee{" +"id=" + id +", name='" + name + '\'' +", department='" + department + '\'' +'}';
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
         
        Vector<Employee> employeeVector = new Vector<>();

        
        employeeVector.add(new Employee(101, "Alice", "HR"));
        employeeVector.add(new Employee(102, "Bob", "Engineering"));
        employeeVector.add(new Employee(103, "Charlie", "Marketing"));
        employeeVector.add(new Employee(104, "David", "Finance"));
        employeeVector.add(new Employee(105, "Eve", "Operations"));

 
        System.out.println("All Employees:");
        for (Employee employee : employeeVector) {
            System.out.println(employee);
        }

        
        int employeeIdToRemove = 103;
        for (Employee employee : employeeVector) {
            if (employee.getId() == employeeIdToRemove) {
                employeeVector.remove(employee);
                break;
            }
        }

       
        System.out.println("\nEmployees after removal:");
        for (Employee employee : employeeVector) {
            System.out.println(employee);
        }
    }
}
