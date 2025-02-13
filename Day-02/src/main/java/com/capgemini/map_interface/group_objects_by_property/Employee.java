package com.capgemini.map_interface.group_objects_by_property;

public class Employee {
    // Declaring attributes
    String name, department;

    // Parameterized constructor to initialize the objects
    Employee(String name, Department department) {
        this.name = name;
        this.department = department.name;
        department.addEmployee(this);
    }
}
