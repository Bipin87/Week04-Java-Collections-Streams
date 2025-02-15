package com.capgemini.regex.basic_regex_problem.validate_a_hex_color_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColor {
    // Method to validate hex color code
    public static boolean validateHexColorCode(String text){
        String regex = "^#[a-fA-F0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.matches()){
            // Valid case
            return true;
        }
        // Invalid case
        return false;
    }
}
