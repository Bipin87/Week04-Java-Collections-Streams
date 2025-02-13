package com.capgemini.java_streams.serialization_save_and_retrieve_an_object;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // File path
        String filePath = "src/main/java/com/capgemini/java_streams/serialization_save_and_retrieve_an_object/text.txt";
        // Add the details of employees
        Employee employee1 = new Employee(filePath,"CG211043", "Bipin","HR",27000.00);
        Employee employee2 = new Employee(filePath,"CG211049", "Deepraj","IT",32400.00);
        Employee employee3 = new Employee(filePath,"CG211001", "Aman","IT",42000.00);
        Employee employee4 = new Employee(filePath,"CG211059", "Durgesh","HR",27000.00);
        Employee employee5 = new Employee(filePath,"CG211032", "Abhinav","HR",52000.00);

        // Create the list
        List<Employee>employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        // Display the list before serialization and deserialization
        System.out.println("Before Serialization: " + employees);
        // Create the object of Employee class
        Employee emp = new Employee(filePath,"","","",0);
        // Call method of serializeEmployee
        emp.serializeEmployee(employees);

        // Call the method and display results
        System.out.println("After deserialization: "+emp.deserializeEmployee());
    }
}
