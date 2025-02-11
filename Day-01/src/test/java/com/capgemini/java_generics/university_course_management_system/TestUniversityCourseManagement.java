package com.capgemini.java_generics.university_course_management_system;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestUniversityCourseManagement {
    @Test
    public void test() {
        // Declaring the objects of various course classes
        CourseExam test2 = new CourseExam();
        AssignmentCourse test1 = new AssignmentCourse();
        ResearchCourse test3 = new ResearchCourse();

        // Object of Course class
        Course<CourseType> course = new Course<>();

        // Adding attributes to the objects and adding them to the storage
        test1.setCourseAttributes("Higher Secondary", 12);
        course.addCourse(test1);
        test2.setCourseAttributes("Engineering", 48);
        course.addCourse(test2);
        test3.setCourseAttributes("PHD", 24);
        course.addCourse(test3);

        // Getting the list of items from course
        List<CourseType> expectedResult = course.getCourses();

        // Performing tests
        assertEquals(test1, expectedResult.getFirst());
        assertEquals(test2, expectedResult.get(1));
        assertEquals(test3, expectedResult.get(2));
    }
}

