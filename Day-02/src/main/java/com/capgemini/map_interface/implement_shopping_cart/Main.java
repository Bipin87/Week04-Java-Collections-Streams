package com.capgemini.map_interface.implement_shopping_cart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add sample products
        cart.addProduct("Laptop", 120000.00);
        cart.addProduct("Headphones", 2400.00);
        cart.addProduct("Smartphone", 25000.00);
        cart.addProduct("Mouse", 500.00);
        cart.addProduct("Keyboard", 1000.00);

        // Display product details
        System.out.println("Product Prices (HashMap): " + cart.getProductPrices());
        System.out.println("Ordered Products (LinkedHashMap): " + cart.getOrderedProducts());
        System.out.println("Sorted Products (TreeMap): " + cart.getSortedProducts());
    }
}
