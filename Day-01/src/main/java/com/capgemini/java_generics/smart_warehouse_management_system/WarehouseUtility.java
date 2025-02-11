package com.capgemini.java_generics.smart_warehouse_management_system;

import java.util.List;

public class WarehouseUtility {
    // Display method used the upper bounded wildcards
    public static void display(List<? extends WarehouseItem> items){
        for(WarehouseItem item : items){
            System.out.println("Item name: "+item.getName() + "   Price: " + item.getPrice() + "   Quantity: " + item.getQuantity());
        }
    }
}
