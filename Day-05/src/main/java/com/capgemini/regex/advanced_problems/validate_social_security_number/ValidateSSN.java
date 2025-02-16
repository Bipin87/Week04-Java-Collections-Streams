package com.capgemini.regex.advanced_problems.validate_social_security_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {

    // Method to validate a security number
    public static String validateSecurityNumber(String text){
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {

            String ssn = matcher.group();
            return ssn + " is valid";
        }

        return "Invalid";
    }
}
