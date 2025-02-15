package com.capgemini.regex.extraction_problems.extract_dates_in_format;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    // Method to extract the extract dates in dd/mm/yyyy format
    public static ArrayList<String> extractDatesInFormat(String text){
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> dates = new ArrayList<>();

        while(matcher.find()){
            // Add date in arrayList
            dates.add(matcher.group());
        }

        return dates;
    }
}
