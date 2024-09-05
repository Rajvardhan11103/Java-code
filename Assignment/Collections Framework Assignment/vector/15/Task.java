/* 15. Task Management System:
Write a Java program to create a Vector of Task objects. Each Task object should have 
properties such as id, description, and priority. Add five tasks to the vector and provide 
functionality to update a task's priority based on its id. */ 

import java.util.Vector;

class Task {
    private int id;
    private String description;
    private int priority; // Assuming higher values indicate higher priority

    public Task(int id, String description, int priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
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
        
        Vector<Task> taskVector = new Vector<>();

        
        taskVector.add(new Task(101, "Write report", 3));
        taskVector.add(new Task(102, "Review code", 2));
        taskVector.add(new Task(103, "Test feature", 1));
        taskVector.add(new Task(104, "Refactor module", 2));
        taskVector.add(new Task(105, "Deploy release", 3));

        
        int taskIdToUpdate = 103;
        for (Task task : taskVector) {
            if (task.getId() == taskIdToUpdate) {
                task.setPriority(1); // Update priority to highest
                break;
            }
        }

  
        System.out.println("Updated Task List:");
        for (Task task : taskVector) {
            System.out.println(task);
        }
    }
}
