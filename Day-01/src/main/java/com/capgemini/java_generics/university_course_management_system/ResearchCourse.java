package com.capgemini.java_generics.university_course_management_system;


public class ResearchCourse extends CourseType{
    // Overriding the setter method of CourseType class
    @Override
    public void setCourseAttributes(String name, int durationInMonths){
        this.name = name;
        this.durationInMonths = durationInMonths;
        this.type = "Research Course";
    }
}