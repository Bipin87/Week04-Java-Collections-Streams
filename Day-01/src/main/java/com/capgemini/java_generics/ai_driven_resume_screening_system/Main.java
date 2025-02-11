package com.capgemini.java_generics.ai_driven_resume_screening_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating instances of different job roles
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        // Processing resumes using the utility method
        Resume<SoftwareEngineer> resume1 = ResumeScreening.processResume("BK Sahu", softwareEngineer);
        Resume<DataScientist> resume2 = ResumeScreening.processResume("Aman", dataScientist);
        Resume<ProductManager> resume3 = ResumeScreening.processResume("Abhinav", productManager);

        // Displaying resumes details
        System.out.println("Resume Details:");
        System.out.println(resume1.getResumeDetails());
        System.out.println();
        System.out.println(resume2.getResumeDetails());
        System.out.println();
        System.out.println(resume3.getResumeDetails());

        // Storing all job roles in a list using wildcards
        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(softwareEngineer);
        jobRoles.add(dataScientist);
        jobRoles.add(productManager);

        // Displaying screening results for multiple job roles
        System.out.println("\nScreening Multiple Resumes:");
        ResumeScreening.screenMultipleResumes(jobRoles);
    }
}
