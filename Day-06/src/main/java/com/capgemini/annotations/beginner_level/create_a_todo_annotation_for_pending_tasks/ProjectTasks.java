package com.capgemini.annotations.beginner_level.create_a_todo_annotation_for_pending_tasks;

public class ProjectTasks {
    @Todo(task = "Implement login feature", assignedTo = "Bipin", priority = "HIGH")
    public void login() {
        System.out.println("Login functionality in progress...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bhupendra") // Default priority MEDIUM
    public void optimizeDatabase() {
        System.out.println("Optimizing database queries...");
    }
}