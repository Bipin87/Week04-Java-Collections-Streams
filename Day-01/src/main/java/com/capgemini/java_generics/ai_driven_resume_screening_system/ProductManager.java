package com.capgemini.java_generics.ai_driven_resume_screening_system;

public class ProductManager extends JobRole {
    // Non parameterized constructor
    public ProductManager() {
        super("Product Manager");
    }

    // Implementing the method to specify required skills for this role
    @Override
    public String requiredSkills() {
        return "Skills: Market Research, Agile, Business Strategy, Leadership";
    }
}
