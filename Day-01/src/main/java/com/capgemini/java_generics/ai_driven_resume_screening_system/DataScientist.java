package com.capgemini.java_generics.ai_driven_resume_screening_system;

public class DataScientist extends JobRole {
    // Non parameterized constructor
    public DataScientist() {
        super("Data Scientist");
    }

    // Implementing the method to specify required skills for this role
    @Override
    public String requiredSkills() {
        return "Skills: Python, Machine Learning, Data Analysis, Deep Learning";
    }
}
