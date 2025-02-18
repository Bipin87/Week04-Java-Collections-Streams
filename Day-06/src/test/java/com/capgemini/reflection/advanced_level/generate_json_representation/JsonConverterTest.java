package com.capgemini.reflection.advanced_level.generate_json_representation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JsonConverterTest {

    @Test
    void testToJson() {
        Person person = new Person("Bipin",21,true);
        String expectedJson = "{\"name\":\"Bipin\", \"age\":21, \"accessible\":true}";
        String actualJson = JsonConvertor.toJson(person);
        assertEquals(expectedJson, actualJson);
    }

    @Test
    void testToJsonWithNull() {
        Person person = new Person(null, 30, false);
        String expectedJson = "{\"name\":null, \"age\":30, \"accessible\":false}";
        String actualJson = JsonConvertor.toJson(person);
        assertEquals(expectedJson, actualJson);
    }
}
