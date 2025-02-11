package com.capgemini.java_generics.smart_warehouse_management_system;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop",59999.99,1));
        electronicsStorage.addItem(new Electronics("Smartphone",21999.00,2));
        electronicsStorage.addItem(new Electronics("TV",34999.00,5));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("TATA SALT",32,2));
        groceriesStorage.addItem(new Groceries("OIL",190,3));
        groceriesStorage.addItem(new Groceries("Tomato",40,4));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair",699,5));
        furnitureStorage.addItem(new Furniture("Table",4999,1));
        furnitureStorage.addItem(new Furniture("Dinner Table",6999,1));


        WarehouseUtility.display(electronicsStorage.getItems());
        System.out.println();
        WarehouseUtility.display(groceriesStorage.getItems());
        System.out.println();
        WarehouseUtility.display(furnitureStorage.getItems());




    }
}
