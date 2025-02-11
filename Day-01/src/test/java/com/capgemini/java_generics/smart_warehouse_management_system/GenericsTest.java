package com.capgemini.java_generics.smart_warehouse_management_system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GenericsTest {
    @Test
    public void test(){
        // Create the object and store the items details
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop",59999.99,1));
        electronicsStorage.addItem(new Electronics("Smartphone",21999.00,2));
        electronicsStorage.addItem(new Electronics("TV",34999.00,5));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table",2300,3));
        furnitureStorage.addItem(new Furniture("Chair",999,6));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("TATA SALT",32,2));

        // Test the actual and expected output is same or not
        assertEquals("Smartphone",electronicsStorage.getItems().get(1).getName());
        assertEquals("TATA SALT", groceriesStorage.getItems().get(0).getName());
        assertEquals("Chair",furnitureStorage.getItems().get(1).getName());

        // Test the wrong output
        assertNotEquals("table",furnitureStorage.getItems().get(0).getName());
    }

}
