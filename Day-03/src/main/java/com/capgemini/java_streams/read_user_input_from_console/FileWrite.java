package com.capgemini.java_streams.read_user_input_from_console;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void writeFile(String fileName,String name,int age, String progLanguage){
        String filePath = "src/main/java/com/capgemini/java_streams/read_user_input_from_console/" + fileName;
        File file = new File(filePath);
        try{
            // Ensure the file exists
            if (!file.exists()) {
                file.getParentFile().mkdirs(); // Create directories if they do not exist
                file.createNewFile(); // Create the file
            }
            try (FileWriter newFile = new FileWriter(filePath)){
                newFile.write("Name: "+name + "\nAge: "+age +"\nProgramming Language: "+progLanguage);
            }

        }
        catch (IOException e){
            System.out.println("Input Output Exception occur: "+e.getMessage());
        }
    }
}
