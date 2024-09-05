/* Problem 5: Employee Roles
Description: Create an interface Workable to represent different types of employees and their 
work.
Requirements:
1. Create an interface Workable with a method work().
2. Implement this interface in classes Manager, Developer, and Intern.
3. Each class should provide its own implementation of the work() method.
4. Implement a main method to create instances of each employee type and demonstrate their 
work. */

 
interface Workable {
    void work();
}

 
class Manager implements Workable {
    @Override
    public void work() {
        System.out.println("Managing team and projects...");
    }
}

 
class Developer implements Workable {
    @Override
    public void work() {
        System.out.println("Writing and debugging code...");
    }
}

 
class Intern implements Workable {
    @Override
    public void work() {
        System.out.println("Assisting with tasks and learning...");
    }
}

 
class EmployeeRoles {
    public static void main(String[] args) {
           
        Workable manager = new Manager();
        Workable developer = new Developer();
        Workable intern = new Intern();

         
        manager.work();
        developer.work();
        intern.work();
    }
}
