package com.capgemini.regex.extraction_problems.extract_all_email_addresses_from_a_text;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.capgemini.regex.extraction_problems.extract_all_email_addresses_from_a_text.ExtractEmailAddress.extractEmailAddress;
import static org.junit.jupiter.api.Assertions.*;

class ExtractEmailAddressTest {
    @Test
    public void testValidCase(){
        // Test perform valid case
        ArrayList<String> emails=extractEmailAddress("Contact us at support@example.com and info@company.org");
        assertEquals("support@example.com",emails.get(0));
    }
    @Test
    public void testInvalidCase(){
        // Test perform invalid case
        assertNotEquals("support@example.com",extractEmailAddress("Contact us at support@example.com and info@company.org"));
    }


}