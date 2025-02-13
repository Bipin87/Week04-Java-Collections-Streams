package com.capgemini.map_interface.implement_shopping_cart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Double> orderedProducts = new LinkedHashMap<>();
    private Map<Double, String> sortedProducts = new TreeMap<>();

    // Method to add a product to the cart
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        orderedProducts.put(product, price);
        sortedProducts.put(price, product);
    }

    // Retrieve all products with prices
    public Map<String, Double> getProductPrices() {
        return productPrices;
    }

    // Retrieve products in the order they were added
    public Map<String, Double> getOrderedProducts() {
        return orderedProducts;
    }

    // Retrieve products sorted by price
    public Map<Double, String> getSortedProducts() {
        return sortedProducts;
    }
}
