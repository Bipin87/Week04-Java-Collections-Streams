package com.capgemini.reflection.basic_level.access_private_field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;

class PersonTest {
    Person person = new Person(25);
    @BeforeEach
    public void testToModify() throws Exception {

        // Modify private field 'age' using reflection
        Reflection.setPrivateField(person, "age", 30);

    }
    @Test
    public void testToGetPrivateField() throws Exception{
        //Retrieve private field 'age' using reflection
        int modifiedAge = (int) Reflection.getPrivateField(person,"age");
        assertEquals(30,modifiedAge);

    }

}