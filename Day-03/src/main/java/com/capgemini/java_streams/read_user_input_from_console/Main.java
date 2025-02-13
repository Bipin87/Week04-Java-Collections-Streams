package com.capgemini.java_streams.read_user_input_from_console;
import com.capgemini.java_streams.buffered_streams_efficient_file_copy.FileCopy;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the name:- \n");
            String name = bufferedReader.readLine().trim();
            System.out.println("Enter the age:-");
            int age = Integer.parseInt(bufferedReader.readLine().trim());
            System.out.println("Enter favorite programming language");
            String progLanguage= bufferedReader.readLine().trim();

            System.out.println("Enter the file name");
            String fileName = bufferedReader.readLine().trim();

            FileWrite.writeFile(fileName,name,age,progLanguage);

        }
        catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the name:- \n");
            String name = bufferedReader.readLine().trim();
            System.out.println("Enter the age:-");
            int age = Integer.parseInt(bufferedReader.readLine().trim());
            System.out.println("Enter favorite programming language");
            String progLanguage= bufferedReader.readLine().trim();

            System.out.println("Enter the file name");
            String fileName = bufferedReader.readLine().trim();

            FileWrite.writeFile(fileName,name,age,progLanguage);

        }
        catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }

    }
}
