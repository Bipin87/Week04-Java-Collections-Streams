package com.capgemini.reflection.advanced_level.create_a_custom_object_mapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        // Create a map of properties
        Map<String, Object> studentProperties = new HashMap<>();
        studentProperties.put("name", "Aman");
        studentProperties.put("age", 22);

        // Convert map to Student object
        Student student = CustomObjectMapper.toObject(Student.class, studentProperties);

        // Print the created object
        System.out.println(student);
    }
}
