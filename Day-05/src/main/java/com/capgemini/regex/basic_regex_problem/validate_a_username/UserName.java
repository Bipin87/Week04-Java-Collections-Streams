package com.capgemini.regex.basic_regex_problem.validate_a_username;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {
    public static boolean validateUserName(String text){
        String regex = "\\b[a-zA-Z][a-zA-z0-9_]{5,15}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.matches()){

            return true;
        }
        return false;
    }


}