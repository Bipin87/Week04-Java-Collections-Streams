package com.capgemini.regex.basic_regex_problem.validate_a_license_plate_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateNumber {
    // Method to validate license number plate
    public static boolean validateLicensePlateNumber(String text){
        String regex = "\\b[A-Z]{2}[0-9]{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.matches()){
            // License number plate is valid return true
            return true;
        }
        // Invalid case
        return false;
    }
}
