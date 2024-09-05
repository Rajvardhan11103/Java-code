/* 15. Task Management System:
Write a Java program to create a LinkedList of Task objects. Each Task object should 
have properties such as id, description, and priority. Add five tasks to the list and provide 
functionality to update a task's priority based on its id. */ 


import java.util.LinkedList;

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
}

class TaskManagementSystem {
    public static void main(String[] args) {
        LinkedList<Task> taskList = new LinkedList<>();

        // Add tasks
        taskList.add(new Task(101, "Finish project report", 3));
        taskList.add(new Task(102, "Review code changes", 2));
        taskList.add(new Task(103, "Prepare presentation", 1));
        taskList.add(new Task(104, "Test new feature", 2));
        taskList.add(new Task(105, "Respond to emails", 3));

        // Print the initial list
        System.out.println("Initial task list:");
        for (Task task : taskList) {
            System.out.println("Task " + task.getId() + ": " + task.getDescription() + " (Priority: " + task.getPriority() + ")");
        }

        // Update a task's priority (e.g., update task with ID 103)
        int targetId = 103;
        for (int i = 0; i < taskList.size(); i++) {
            Task task = taskList.get(i);
            if (task.getId() == targetId) {
                task.setPriority(2); // Update priority
                break;
            }
        }

        // Print the updated list
        System.out.println("\nTask list after updating task with ID " + targetId + ":");
        for (Task task : taskList) {
            System.out.println("Task " + task.getId() + ": " + task.getDescription() + " (Priority: " + task.getPriority() + ")");
        }
    }
}


