package com.capgemini.annotations.beginner_level.create_a_todo_annotation_for_pending_tasks;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}