/* 2. Sorting Employees by Salary and Department:
	o Write a Java program to create an Employee class with properties employeeId, name, 
		and salary. Implement two Comparator classes:
		1. BySalaryComparator: Sort employees by their salary in descending 
		
		2. ByDepartmentComparator: Sort employees by their department names 
	
		o Create an ArrayList of Employee objects, add five employees with different salaries 
			and department names, and use both comparators to sort the list. Display the 
			sorted lists.
*/ 

import java.util.*;

class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String department;

    public Employee(int employeeId, String name, double salary, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
	    public String getDepartment() {
        return department;
    }


    @Override
    public String toString() {
        return "Employee{" +"employeeId=" + employeeId +", name='" + name + '\'' +", salary=" + salary +", department='" + department + '\'' +'}';
    }
}

class BySalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Double.compare(emp2.getSalary(), emp1.getSalary());
    }
}

class ByDepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getDepartment().compareToIgnoreCase(emp2.getDepartment());
    }
}

class EmployeeSortingExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 75000.0, "HR"));
        employees.add(new Employee(102, "Bob", 80000.0, "Engineering"));
        employees.add(new Employee(103, "Charlie", 70000.0, "Marketing"));
        employees.add(new Employee(104, "David", 85000.0, "Finance"));
        employees.add(new Employee(105, "Eve", 72000.0, "Sales"));

        // Sort by salary (descending)
        Collections.sort(employees, new BySalaryComparator());
        System.out.println("Sorted by salary (descending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Sort by department name
        Collections.sort(employees, new ByDepartmentComparator());
        System.out.println("\nSorted by department name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
