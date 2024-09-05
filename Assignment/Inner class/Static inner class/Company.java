/* Scenario 1: Employee Management System
Problem Statement: You are developing an Employee Management System in Java. Implement 
a method in the Company class that generates reports based on employee data. Use a static inner 
class to encapsulate report generation logic.
	Requirements:
		Company Class:
			 Define a Company class that manages a list of employees.
			 Implement a method generateEmployeeReport that generates a report based on employee 
			information.
		Static Inner Class: ReportGenerator
			 Implement a static inner class ReportGenerator within Company.
			 ReportGenerator should encapsulate methods to format and print employee details, such as 
			name, age, and department.
		Usage and Testing:
			 Instantiate Company in a main class and add sample employee data.
			 Call generateEmployeeReport to generate and display the employee report using 
			ReportGenerator.
*/ 

import java.util.ArrayList;
import java.util.List;
 
class Company {
    private List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void generateEmployeeReport() {
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.printEmployeeReport(employees);
    }

    
    static class Employee {
        private String name;
        private int age;
        private String department;

        public Employee(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

         
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getDepartment() {
            return department;
        }
    }

    // Static inner class for report generation
    static class ReportGenerator {
        public void printEmployeeReport(List<Employee> employees) {
            System.out.println("Employee Report:");
            for (Employee employee : employees) {
                System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() +", Department: " + employee.getDepartment());
            }
        }
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new Company.Employee("Alice", 30, "HR"));
        company.addEmployee(new Company.Employee("Bob", 28, "Engineering"));
        company.addEmployee(new Company.Employee("Charlie", 35, "Finance"));

         
        company.generateEmployeeReport();
    }
}
