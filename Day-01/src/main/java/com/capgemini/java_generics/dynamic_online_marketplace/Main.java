package com.capgemini.java_generics.dynamic_online_marketplace;

public class Main {

    public static void main(String[] args) {
        // Create instances of different product categories
        BookCategory bookCategory = new BookCategory("Story Book");
        ClothingCategory clothingCategory = new ClothingCategory("Shirt");
        GadgetCategory gadgetCategory = new GadgetCategory("Smartphone");

        // Create instances of products
        Product<BookCategory> book = new Product<>("Godaan", 130, bookCategory);
        Product<ClothingCategory> shirt = new Product<>("Polo Shirt", 1299.99, clothingCategory);
        Product<GadgetCategory> smartphone = new Product<>("IPhone", 149999.99, gadgetCategory);

        // Apply discounts to products
        Product.applyDiscount(book, 10); // 10% discount
        Product.applyDiscount(shirt, 17); // 17% discount
        Product.applyDiscount(smartphone, 12); // 12% discount

        // Display updated prices
        System.out.println(book.getName() + " new price: " + book.getPrice());
        System.out.println(shirt.getName() + " new price: " + shirt.getPrice());
        System.out.println(smartphone.getName() + " new price: " + smartphone.getPrice());
    }
}