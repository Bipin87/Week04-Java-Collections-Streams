package com.capgemini.exception_handling.check_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionClass {

    // Method to handle exception occur
    public static String exceptionHandle(String filePath){
        String data = "";
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;

            while((line = bufferedReader.readLine())!= null ){
                 data += "\n" +line;

            }
            bufferedReader.close();
        }
        catch (IOException e){
            return "File Not Found";
        }
       return data;
    }
}
