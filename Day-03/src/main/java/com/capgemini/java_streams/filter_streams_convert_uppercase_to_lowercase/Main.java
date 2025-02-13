package com.capgemini.java_streams.filter_streams_convert_uppercase_to_lowercase;

public class Main {
    public static void main(String[] args) {

        String fileInputPath="src/main/java/com/capgemini/java_streams/filter_streams_convert_uppercase_to_lowercase/uppercase.txt";
        String fileOutputPath = "src/main/java/com/capgemini/java_streams/filter_streams_convert_uppercase_to_lowercase/lowercase.txt";
        ConvertUpperToLowerCase convert=new ConvertUpperToLowerCase(fileInputPath,fileOutputPath);
        convert.convertToLowercase();
        System.out.println("File converted successfully ");

    }
}
