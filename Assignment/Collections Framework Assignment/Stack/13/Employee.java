/* 13. Employee Management System:
Write a Java program to create a Stack of Employee objects. Each Employee object should have 
properties such as id, name, and department. Push five employees onto the stack and provide 
functionality to remove an employee by their id. */ 

import java.util.Stack;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getter for ID (used for removal)
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id +", name='" + name + '\'' +", department='" + department + '\'' +'}';
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        
        Stack<Employee> employeeStack = new Stack<>();

        
        employeeStack.push(new Employee(101, "Alice", "HR"));
        employeeStack.push(new Employee(102, "Bob", "Engineering"));
        employeeStack.push(new Employee(103, "Charlie", "Marketing"));
        employeeStack.push(new Employee(104, "David", "Finance"));
        employeeStack.push(new Employee(105, "Eve", "Sales"));

        
        int removeId = 103;
        for (Employee employee : employeeStack) {
            if (employee.getId() == removeId) {
                employeeStack.remove(employee);
                break;
            }
        }

        
        System.out.println("Remaining employees in the stack:");
        for (Employee employee : employeeStack) {
            System.out.println(employee);
        }
    }
}
