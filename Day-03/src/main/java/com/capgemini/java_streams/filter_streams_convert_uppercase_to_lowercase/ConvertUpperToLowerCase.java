package com.capgemini.java_streams.filter_streams_convert_uppercase_to_lowercase;

import java.io.*;

public class ConvertUpperToLowerCase {
    private String inputFilePath;
    private String outputfilePath;
    ConvertUpperToLowerCase(String inputFilePath, String outputfilePath){
        this.inputFilePath=inputFilePath;
        this.outputfilePath=outputfilePath;
    }
    public void convertToLowercase(){
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputfilePath))) {

            String line;
            while ((line = fileReader.readLine()) != null) {

                // Convert the line to lowercase
                String lowercaseLine = line.toLowerCase();

                // Write the lowercase line to the output file
                bufferedWriter.write(lowercaseLine);

                // Add a newline after each line
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
