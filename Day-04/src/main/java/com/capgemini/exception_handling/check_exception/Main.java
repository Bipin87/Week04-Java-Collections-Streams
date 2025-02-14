package com.capgemini.exception_handling.check_exception;

public class Main {
    public static void main(String[] args) {
        String fileName="text.txt";
        String filePath ="src/main/java/com/capgemini/exception_handling/check_exception/file.txt";

        // Call the method and display the result
        String result = IOExceptionClass.exceptionHandle(fileName);// File not Found Exception
        System.out.println(result);
        String result1=IOExceptionClass.exceptionHandle(filePath);
        System.out.println(result1);
    }
}
