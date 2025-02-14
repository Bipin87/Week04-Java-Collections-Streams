package com.capgemini.exception_handling.try_with_resources;

public class Main {
    public static void main(String[] args) {
        String fileName="text.txt";
        String filePath ="src/main/java/com/capgemini/exception_handling/try_with_resources/file.txt";

        // Call the method and display the result
        String result1 =AutoClosingResources.readFile(filePath);
        System.out.println(result1);
        String result2 =AutoClosingResources.readFile(fileName);
        System.out.println(result2);
    }
}
