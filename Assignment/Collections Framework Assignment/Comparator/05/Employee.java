/* 3. Map
1. Sorting Employees by Salary and Name:
o Write a Java program to create an Employee class with properties employeeId, name, 
and salary. Implement two Comparator classes:
1. BySalaryComparator: Sort employees by their salaries in ascending 
order.
2. ByNameComparator: Sort employees by their names in alphabetical 
order.
o Create a HashMap with Integer keys (employee IDs) and Employee values. Add five 
employees to the map.
o To display the employees sorted by salary, convert the map values to a List and 
sort it using the BySalaryComparator.
o To display the employees sorted by name, convert the map values to a List and 
sort it using the ByNameComparator. */ 


import java.util.*;

class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (ID: " + employeeId + ") - Salary: $" + salary;
    }
}

class BySalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}

class ByNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class EmployeeSortingExample {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(101, new Employee(101, "Alice", 60000.0));
        employeeMap.put(102, new Employee(102, "Bob", 55000.0));
        employeeMap.put(103, new Employee(103, "Charlie", 65000.0));
        employeeMap.put(104, new Employee(104, "David", 58000.0));
        employeeMap.put(105, new Employee(105, "Eva", 62000.0));

        List<Employee> employeesBySalary = new ArrayList<>(employeeMap.values());
        Collections.sort(employeesBySalary, new BySalaryComparator());

        System.out.println("Employees sorted by salary:");
        for (Employee employee : employeesBySalary) {
            System.out.println(employee);
        }

        List<Employee> employeesByName = new ArrayList<>(employeeMap.values());
        Collections.sort(employeesByName, new ByNameComparator());

        System.out.println("\nEmployees sorted by name:");
        for (Employee employee : employeesByName) {
            System.out.println(employee);
        }
    }
}
