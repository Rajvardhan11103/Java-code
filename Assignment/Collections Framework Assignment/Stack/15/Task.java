/*15. Task Management System:
Write a Java program to create a Stack of Task objects. Each Task object should have 
properties such as id, description, and priority. Push five tasks onto the stack and provide 
functionality to update a task's priority based on its id. */ 

import java.util.Stack;

class Task {
    private int id;
    private String description;
    private int priority; // Assume higher values indicate higher priority

    public Task(int id, String description, int priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    
    public int getId() {
        return id;
    }

     
    public int getPriority() {
        return priority;
    }

   
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +"id=" + id +", description='" + description + '\'' +", priority=" + priority +'}';
    }
}

class TaskManagementSystem {
    public static void main(String[] args) {
         
        Stack<Task> taskStack = new Stack<>();

        
        taskStack.push(new Task(101, "Write report", 3));
        taskStack.push(new Task(102, "Review code", 2));
        taskStack.push(new Task(103, "Test feature", 1));
        taskStack.push(new Task(104, "Refactor module", 2));
        taskStack.push(new Task(105, "Deploy release", 3));

        
        int taskIdToUpdate = 103;
        int newPriority = 4; // Assume higher values indicate higher priority
        for (Task task : taskStack) {
            if (task.getId() == taskIdToUpdate) {
                task.setPriority(newPriority);
                break;
            }
        }

         
        System.out.println("Updated task list:");
        for (Task task : taskStack) {
            System.out.println(task);
        }
    }
}
