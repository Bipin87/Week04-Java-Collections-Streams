package com.capgemini.java_generics.ai_driven_resume_screening_system;

public class SoftwareEngineer extends JobRole {
    // Non parameterized constructor
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    // Implementing the method to specify required skills for this role
    @Override
    public String requiredSkills() {
        return "Skills: Java, C++, DSA, System Design, Problem Solving";
    }
}
