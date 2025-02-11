package com.capgemini.java_generics.ai_driven_resume_screening_system;

// Defining an abstract class to represent a Job Role
abstract class JobRole {
    // Declaring attribute
    protected String jobTitle;

    // Parameterized constructor
    public JobRole(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Abstract method to be implemented by specific job roles to describe required skills
    public abstract String requiredSkills();
}
