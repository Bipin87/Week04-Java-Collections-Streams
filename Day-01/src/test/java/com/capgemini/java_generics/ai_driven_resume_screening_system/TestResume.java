package com.capgemini.java_generics.ai_driven_resume_screening_system;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestResume {
    // Test case to check if Resume object is created correctly
    @Test
    void test1() {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        Resume<SoftwareEngineer> resume = new Resume<>("Abhinav", softwareEngineer);

        assertEquals("Abhinav", resume.getApplicantName());
        assertEquals("Software Engineer", resume.getJobRole().jobTitle);
    }

    // Test case to check if the processResume method works correctly
    @Test
    void test2() {
        DataScientist dataScientist = new DataScientist();
        Resume<DataScientist> resume = ResumeScreening.processResume("BK Sahu", dataScientist);

        assertNotNull(resume);
        assertEquals("BK Sahu", resume.getApplicantName());
        assertEquals("Data Scientist", resume.getJobRole().jobTitle);
    }

    // Test case to check wildcard method for screening multiple job roles
    @Test
    void test3() {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(softwareEngineer);
        jobRoles.add(dataScientist);
        jobRoles.add(productManager);

        assertDoesNotThrow(() -> ResumeScreening.screenMultipleResumes(jobRoles));
    }

}