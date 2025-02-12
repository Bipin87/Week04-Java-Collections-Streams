package com.capgemini.java_generics.smart_warehouse_management_system;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    // Create the items list variable that can store the data
    private List<T> items = new ArrayList<>();

    // Add the item in list
    public void addItem(T item) {
        items.add(item);
    }

    // Get the items in list
    public List<T> getItems() {
        return items;
    }

    // Display the items details
    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
