 /* Problem 4: Employee Roles
Description: Create a class hierarchy for different types of employees, where each type of 
employee has a different way of working. Use method overriding to achieve polymorphism.
Requirements:
1. Create a base class Employee with a method work().
2. Create derived classes Manager, Developer, and Intern, each overriding the work() method to 
describe their respective work.
3. Implement a main method to demonstrate calling work() on different employee objects 
stored in an Employee array.
 */
 
 
class Employee {
    public void work() {
        System.out.println("Employee is working");
    }
}
 
class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Manager is managing the team");
    }
}

 
class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Developer is writing code");
    }
}

 
class Intern extends Employee {
    @Override
    public void work() {
        System.out.println("Intern is learning and assisting");
    }
}

class EmployeeRolesDemo {
    public static void main(String[] args) {
        
        Employee[] employees = {new Manager(), new Developer(), new Intern()};

         
        for (Employee employee : employees) {
            employee.work();
        }
    }
}
