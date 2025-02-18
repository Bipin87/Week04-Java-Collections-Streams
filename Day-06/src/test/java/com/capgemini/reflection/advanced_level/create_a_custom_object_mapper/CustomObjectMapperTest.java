package com.capgemini.reflection.advanced_level.create_a_custom_object_mapper;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CustomObjectMapperTest {

    @Test
    public void testToObject() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Abhinav");
        properties.put("age", 25);

        Student student = CustomObjectMapper.toObject(Student.class, properties);

        assertNotNull(student);
        assertEquals("Abhinav", student.getName());
        assertEquals(25, student.getAge());
    }
}