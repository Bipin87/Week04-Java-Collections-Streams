package com.capgemini.regex.replace_and_modify_strings.replace_multiple_spaces_with_a_single_space;


public class ReplaceMultipleToSingleSpace {
    // Method to replace multiple spaces to single spaces in string
    public static String replacedSpace(String text){
        //Replace multiple spaces with one space
        String replacedText = text.replaceAll("\\s+", " ");
        return replacedText;
    }
}
