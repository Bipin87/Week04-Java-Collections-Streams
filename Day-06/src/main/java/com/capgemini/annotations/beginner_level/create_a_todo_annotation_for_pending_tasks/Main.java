package com.capgemini.annotations.beginner_level.create_a_todo_annotation_for_pending_tasks;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the Class object for Project
            Class<?> projectClass = ProjectTasks.class;

            // Get all declared methods in the class
            Method[] methods = projectClass.getDeclaredMethods();

            // Iterate over the methods
            for (Method method : methods) {
                // Check if the @Todo annotation is present on the method
                if (method.isAnnotationPresent(Todo.class)) {
                    // Retrieve the @Todo annotation
                    Todo todo = method.getAnnotation(Todo.class);

                    // Print the task details
                    System.out.println("Method: " + method.getName());
                    System.out.println("Task: " + todo.task());
                    System.out.println("Assigned To: " + todo.assignedTo());
                    System.out.println("Priority: " + todo.priority());
                    System.out.println();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}