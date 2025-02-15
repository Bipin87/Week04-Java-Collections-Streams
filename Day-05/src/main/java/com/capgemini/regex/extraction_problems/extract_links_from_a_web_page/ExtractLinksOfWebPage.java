package com.capgemini.regex.extraction_problems.extract_links_from_a_web_page;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksOfWebPage {
    // Method to extract the extract links from a web page
    public static ArrayList<String> extractLinksOfWeb(String text){
        String regex = "\\bhttps?://(www\\.)?([a-zA-Z0-9.-]+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> webPageLinks = new ArrayList<>();

        while(matcher.find()){
            // Add link in arrayList
            webPageLinks.add(matcher.group());
        }

        return webPageLinks;
    }
}
