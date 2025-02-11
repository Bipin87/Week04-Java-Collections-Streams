package com.capgemini.java_generics.smart_warehouse_management_system;

// Abstract class
abstract class WarehouseItem{
    //Declaring the attributes
    String name;
    double price;
    int quantity;


    // Create the class constructor
    public WarehouseItem(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    // Get the name
    public String getName(){
        return name;
    }
    // Get the price
    public double getPrice(){
        return price;

    }
    // Get the quantity
    public int getQuantity(){
        return quantity;
    }

}

