package com.capgemini.java_generics.dynamic_online_marketplace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestOnlineMarketProduct {
    @Test
    public void test() {
        // Create instances of different product categories
        BookCategory bookCategory = new BookCategory("Romantic");
        ClothingCategory clothingCategory = new ClothingCategory("Blazer");
        GadgetCategory gadgetCategory = new GadgetCategory("Smart Watch");

        // Create instances of products
        Product<BookCategory> book = new Product<>("The Unproposed Guy", 150.0, bookCategory);
        Product<ClothingCategory> blazer = new Product<>("Formal Blazer", 290.99, clothingCategory);
        Product<GadgetCategory> smartWatch = new Product<>("NVIDIA", 999.99, gadgetCategory);

        // Apply discounts to products
        Product.applyDiscount(book, 8); // 8% discount
        Product.applyDiscount(blazer, 20); // 20% discount
        Product.applyDiscount(smartWatch, 27); // 27% discount

        assertEquals(138.0, book.getPrice());
        assertEquals(232.792, blazer.getPrice());
        assertNotEquals(949.9905, smartWatch.getPrice());
    }

}