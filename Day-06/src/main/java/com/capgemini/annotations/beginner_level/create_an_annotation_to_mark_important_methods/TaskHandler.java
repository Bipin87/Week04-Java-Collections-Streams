package com.capgemini.annotations.beginner_level.create_an_annotation_to_mark_important_methods;

public class TaskHandler {
    @ImportantMethod
    public void completeTask() {
        System.out.println("Completing task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void reviewTask() {
        System.out.println("Reviewing task...");
    }

    public void deleteTask() {
        System.out.println("Deleting task...");
    }
}