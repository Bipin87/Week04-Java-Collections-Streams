package com.capgemini.exception_handling.custom_exception;

import org.junit.jupiter.api.Test;

import static com.capgemini.exception_handling.custom_exception.CustomException.validateAge;
import static org.junit.jupiter.api.Assertions.*;

class CustomExceptionTest {
    @Test
    public void testFirst(){
        try{
            String result = validateAge(32);
            assertEquals("Access granted!",result);
            assertNotEquals("Access granted!",validateAge(12));

        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }


}