package com.capgemini.regex.advanced_problems.extract_currency_values_from_a_text;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {
    //method to extract currency value
    public static ArrayList<String> extractCurrency(String text){

        //initialize an arraylist currency to store currency
        ArrayList<String> currency = new ArrayList<>();

        String regex = "\\$?\\d+(\\.\\d{1,2})?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            currency.add(matcher.group());
        }
        return currency;
    }
}
