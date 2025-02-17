package com.capgemini.reflection.basic_level.dynamically_create_objects;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Student.class;
        // Get constructor
        Constructor<?> constructor = cls.getConstructor(String.class);
        // Create instance dynamically
        Student student = (Student) constructor.newInstance("Bipin");
        // Call method
        student.display();
    }

}
