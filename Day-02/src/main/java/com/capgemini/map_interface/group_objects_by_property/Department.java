package com.capgemini.map_interface.group_objects_by_property;

import java.util.ArrayList;

public class Department {
    // Declaring attributes
    String name;
    ArrayList<Employee> employees;

    // Parameterized constructor to initialize the objects
    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Method to add employees in the employees list
    void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
