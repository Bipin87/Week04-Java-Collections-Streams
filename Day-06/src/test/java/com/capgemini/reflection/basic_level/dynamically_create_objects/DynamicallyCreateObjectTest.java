package com.capgemini.reflection.basic_level.dynamically_create_objects;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

class DynamicallyCreateObjectTest {
    @Test
    public void test() throws Exception{
        Class<?> cls = Student.class;
        // Get constructor
        Constructor<?> constructor = cls.getConstructor(String.class);
        // Create instance dynamically
        Student student = (Student) constructor.newInstance("Bipin");

        // Perform tests
        assertEquals("Bipin",student.getName());
        assertNotNull(student);
    }

}