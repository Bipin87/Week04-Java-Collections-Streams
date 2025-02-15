package com.capgemini.regex.extraction_problems.extract_dates_in_format;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.capgemini.regex.extraction_problems.extract_dates_in_format.ExtractDates.extractDatesInFormat;
import static org.junit.jupiter.api.Assertions.*;

class ExtractDatesTest {
    @Test
    public void testValidCase(){
        // Test perform valid case
        ArrayList<String> dates=extractDatesInFormat("The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020");
        assertEquals("12/05/2023",dates.get(0));
        assertFalse(dates.isEmpty());
    }
    @Test
    public void testInvalidCase(){
        // Test perform invalid case
        assertNotEquals("23/12/2021", extractDatesInFormat("The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020").getLast());
    }

}