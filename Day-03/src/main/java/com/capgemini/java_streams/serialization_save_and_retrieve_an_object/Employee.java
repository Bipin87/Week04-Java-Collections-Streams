package com.capgemini.java_streams.serialization_save_and_retrieve_an_object;

import java.io.*;
import java.util.List;

public class Employee implements Serializable {
    // Declaring attributes of class
    private String id;
    private String name;
    private String department;
    private double salary;
    public String filePath;

    //Parameterized constructor
    public Employee(String filePath,String id,String name,String department,double salary){
        this.filePath = filePath;
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Employee{id='" + id + "', name='" + name +"',department='" + department+"', salary='" + salary+"}";
    }
    public void serializeEmployee(List<Employee>employees){
        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employees);

            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  List<Employee> deserializeEmployee(){
        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
