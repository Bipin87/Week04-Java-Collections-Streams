package com.capgemini.java_generics.university_course_management_system;

import java.util.ArrayList;
import java.util.List;

// Define the Course as generic class
public class Course <T extends CourseType> {
    // Attribute
    private List<T> courses;

    // Non parameterized constructor
    public Course() {
        // initializing the list
        courses = new ArrayList<>();
    }

    // Method to add courses to the list
    public void addCourse(T obj) {
        courses.add(obj);
    }

    // Getter method to get courses list
    public List<T> getCourses() {
        return courses;
    }
}
