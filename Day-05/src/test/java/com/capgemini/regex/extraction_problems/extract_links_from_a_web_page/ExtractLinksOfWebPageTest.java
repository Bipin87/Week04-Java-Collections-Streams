package com.capgemini.regex.extraction_problems.extract_links_from_a_web_page;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.capgemini.regex.extraction_problems.extract_dates_in_format.ExtractDates.extractDatesInFormat;
import static com.capgemini.regex.extraction_problems.extract_links_from_a_web_page.ExtractLinksOfWebPage.extractLinksOfWeb;
import static org.junit.jupiter.api.Assertions.*;

class ExtractLinksOfWebPageTest {

    @Test
    public void testValidCase(){
        // Test perform valid case
        ArrayList<String> webLinks=extractLinksOfWeb("Visit https://www.google.com for more info");
        assertEquals("https://www.google.com",webLinks.getFirst());
        assertFalse(webLinks.isEmpty());
    }
    @Test
    public void testInvalidCase(){
        // Test perform invalid case
        assertNotEquals("www.yahoo.com", extractLinksOfWeb("Visit https://www.google.com and http://example.org for more info").getLast());
    }

}