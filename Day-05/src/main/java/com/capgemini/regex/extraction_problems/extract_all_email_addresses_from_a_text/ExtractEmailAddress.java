package com.capgemini.regex.extraction_problems.extract_all_email_addresses_from_a_text;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {
    // Method to extract the email address
    public static ArrayList<String> extractEmailAddress(String text){
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> emails = new ArrayList<>();

        while(matcher.find()){
            // add email in arrayList
            emails.add(matcher.group());
        }

        return emails;
    }
}
