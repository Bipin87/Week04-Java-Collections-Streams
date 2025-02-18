package com.capgemini.reflection.intermediate_level.retrieve_annotaion_at_runtime;

// Apply the custom annotation
@Author(name = "Dr Aayush")
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}