package com.capgemini.java_streams.data_streams_store_and_retrieve_primitive_data;

import java.io.*;

public class StudentDetailsHandling {
    private String fileName;

    public StudentDetailsHandling(String fileName) {
        this.fileName = fileName;
    }

    public void writeStudentData(int rollNumber, String name, double gpa) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            dataOutputStream.writeInt(rollNumber);
            dataOutputStream.writeUTF(name);
            dataOutputStream.writeDouble(gpa);
            System.out.println("Student details written successfully.");
        } catch (IOException e) {
            System.out.println("IOException occur: " + e.getMessage());
        }
    }

    public void readStudentDetails() {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dataInputStream.readInt();
            String name = dataInputStream.readUTF();
            double gpa = dataInputStream.readDouble();
            System.out.println("Student Details Retrieved:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }

}
