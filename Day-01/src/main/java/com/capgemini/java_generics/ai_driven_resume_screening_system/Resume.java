package com.capgemini.java_generics.ai_driven_resume_screening_system;

public class Resume<T extends JobRole> {
    // Declaring a private variable to store the applicant's name
    private String applicantName;

    // Declaring a private variable to store the job role for which the resume is submitted
    private T jobRole;

    // Constructor to initialize the resume with applicant name and job role
    public Resume(String applicantName, T jobRole) {
        this.applicantName = applicantName;
        this.jobRole = jobRole;
    }

    // Method to get the applicant's name
    public String getApplicantName() {
        return applicantName;
    }

    // Method to get the job role for which the resume is submitted
    public T getJobRole() {
        return jobRole;
    }

    // Method to return resume details as a string
    public String getResumeDetails() {
        return "Applicant: " + applicantName + ", Applied for: " + jobRole.jobTitle + "\n" + jobRole.requiredSkills();
    }
}

