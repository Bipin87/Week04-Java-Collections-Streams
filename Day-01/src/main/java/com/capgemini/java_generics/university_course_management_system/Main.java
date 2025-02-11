package com.capgemini.java_generics.university_course_management_system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Object of Course class
        Course<CourseType> course = new Course<>();
        // Object of scanner class
        Scanner sc = new Scanner(System.in);

        // Taking inputs for number of courses from user
        System.out.println("Enter Number of Courses: ");
        int numberOfCourses = sc.nextInt();

        // Taking inputs for courses from user
        System.out.println("Enter Courses Details: ");
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Select Type: \n1) For Exam Course\n2) For Assignment Courses\n3) For Research Courses");
            int type = sc.nextInt();

            // Creating object of class as per selection of the user
            CourseType obj = (type == 1)? new CourseExam() :(type == 2)? new AssignmentCourse() :(type == 3)? new ResearchCourse() : null;

            // If user enters wrong value for selection of type
            if (obj == null) {
                System.out.println("Please Select A Valid Type.");
                i--; // so that user can enter as many courses as he wants
                continue;
            }

            // Taking inputs form users
            System.out.println("Enter the course name: ");
            String name = sc.next();
            System.out.println("Enter course Duration In Months: ");
            int durationInMonths = sc.nextInt();

            obj.setCourseAttributes(name, durationInMonths);
            course.addCourse(obj);

            System.out.println();
        }

        // Displaying details of all courses
        System.out.println("Displaying All courses:");
        CourseType.displayCourses(course.getCourses());
    }
}
