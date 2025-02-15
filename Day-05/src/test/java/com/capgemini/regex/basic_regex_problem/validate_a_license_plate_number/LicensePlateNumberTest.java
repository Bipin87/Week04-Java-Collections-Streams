package com.capgemini.regex.basic_regex_problem.validate_a_license_plate_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LicensePlateNumberTest {
    @Test
    public void testValid(){
        // Test perform valid case
        assertTrue(LicensePlateNumber.validateLicensePlateNumber("AA0001"));
    }
    @Test
    public void testInvalid(){
        // Test perform invalid case
        assertFalse(LicensePlateNumber.validateLicensePlateNumber("BXX345"));
    }

}