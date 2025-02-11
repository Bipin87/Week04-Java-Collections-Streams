package com.capgemini.java_generics.university_course_management_system;
import java.util.List;

// definition of CourseType class which is abstract
abstract public class CourseType {
    // declaring attributes
    protected String name, type;
    protected int durationInMonths;

    // Declaring an abstract setter method
    abstract void setCourseAttributes(String name, int durationInMonths);

    // Created a method to display details of all courses
    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType obj : list) {
            System.out.println("Course Type: " + obj.type + "\nCourse Name: " + obj.name + "\nDuration In Months: " + obj.durationInMonths);
        }
    }
}