package com.capgemini.reflection.intermediate_level.retrieve_annotaion_at_runtime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationTest {
    @Test
    void testAuthorAnnotationPresence() {
        Class<Book> bookClass = Book.class;

        // Ensure the annotation is present
        assertTrue(bookClass.isAnnotationPresent(Author.class));

        // Retrieve and verify annotation value
        Author authorAnnotation = bookClass.getAnnotation(Author.class);
        assertEquals("Dr Aayush", authorAnnotation.name());
        System.out.println("Test1 Passed");
    }

    @Test
    void testAnnotationAbsentOnDifferentClass() {
        class UnrelatedClass {}

        assertFalse(UnrelatedClass.class.isAnnotationPresent(Author.class));
        System.out.println("Test2 Passed");
    }

}