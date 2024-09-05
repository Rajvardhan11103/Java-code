/* Problem 2: Abstract Employee
Description: Create an abstract class Employee to represent different types of employees. Each 
employee should have a method to calculate their salary.
Requirements:
1. Create an abstract class Employee with an abstract method calculateSalary().
2. Create concrete classes FullTimeEmployee, PartTimeEmployee, and Contractor that extend 
Employee and implement the calculateSalary() method.
3. Add attributes to each concrete class: FullTimeEmployee should have monthlySalary, 
PartTimeEmployee should have hourlyRate and hoursWorked, and Contractor should have 
fixedAmount.
4. Implement a main method to create instances of each employee type and display their 
salaries. */

abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class Contractor extends Employee {
    private double fixedAmount;

    public Contractor(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    double calculateSalary() {
        return fixedAmount;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(5000); // Monthly salary of 5000
        Employee partTimeEmployee = new PartTimeEmployee(20, 80); // Hourly rate of 20, 80 hours worked
        Employee contractor = new Contractor(3000); // Fixed amount of 3000

        System.out.printf("Full-Time Employee Salary: %.2f%n", fullTimeEmployee.calculateSalary());
        System.out.printf("Part-Time Employee Salary: %.2f%n", partTimeEmployee.calculateSalary());
        System.out.printf("Contractor Salary: %.2f%n", contractor.calculateSalary());
    }
}
