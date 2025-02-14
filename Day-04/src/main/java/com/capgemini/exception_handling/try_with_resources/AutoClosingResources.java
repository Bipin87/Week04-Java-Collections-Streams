package com.capgemini.exception_handling.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingResources {
    public static String readFile(String filePath){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                return line;
            }

        }
        catch (IOException e){
            return "Error reading file";
        }
        return "";
    }
}
