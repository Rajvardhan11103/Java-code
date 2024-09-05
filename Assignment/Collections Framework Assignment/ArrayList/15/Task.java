/* 15. Task Management System:
Write a Java program to create an ArrayList of Task objects. Each Task object should 
have properties such as id, description, and priority. Add five tasks to the list and provide 
functionality to update a task's priority based on its id. */ 

import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private int id;
    private String description;
    private int priority;

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
        return "ID: " + id + ", Description: " + description + ", Priority: " + priority;
    }
}

class TaskManagementSystem {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Complete project report", 3));
        tasks.add(new Task(2, "Prepare for meeting", 2));
        tasks.add(new Task(3, "Reply to emails", 1));
        tasks.add(new Task(4, "Update website content", 2));
        tasks.add(new Task(5, "Plan team outing", 1));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID of task to update priority: ");
        int idToUpdate = scanner.nextInt();
        System.out.print("Enter new priority: ");
        int newPriority = scanner.nextInt();

        boolean updated = updateTaskPriority(tasks, idToUpdate, newPriority);
        if (updated) {
            System.out.println("Task priority updated successfully.");
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("Current list of tasks:");
        for (Task task : tasks) {
            System.out.println(task);
        }

    }

    public static boolean updateTaskPriority(ArrayList<Task> tasks, int id, int newPriority) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setPriority(newPriority);
                return true;
            }
        }
        return false;
    }
}
