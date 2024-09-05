/* 13. Employee Salary Management:
Write a Java program to create a TreeMap of Integer keys and Employee values where the 
keys are employee IDs and the values are Employee objects. Each Employee object 
should have properties such as name and salary. Add five employees to the map. 
Implement functionality to find and display the employee with the highest salary. */ 

import java.util.*;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters for employee properties
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

class EmployeeSalaryManagement {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and Employee objects
        TreeMap<Integer, Employee> employeeMap = new TreeMap<>();

        // Add five employees
        employeeMap.put(101, new Employee("Alice", 75000.0));
        employeeMap.put(102, new Employee("Bob", 80000.0));
        employeeMap.put(103, new Employee("Carol", 72000.0));
        employeeMap.put(104, new Employee("David", 85000.0));
        employeeMap.put(105, new Employee("Eve", 90000.0));

		// Initialize highestSalary to a special value (e.g., -1)
		double highestSalary = -1;
		Employee highestSalaryEmployee = null;

		for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			Employee employee = entry.getValue();
			double salary = employee.getSalary();

			// Update highest salary if a valid salary is encountered
			if (salary > highestSalary) {
				highestSalary = salary;
				highestSalaryEmployee = employee;
			}
		}

		if (highestSalaryEmployee != null) {
			System.out.println("Employee with the highest salary:");
			System.out.println(highestSalaryEmployee);
		} else {
			System.out.println("No employees found.");
		}

    }
}
