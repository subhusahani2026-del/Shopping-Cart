package com.shoppingcart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    void testAddItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000);

        assertEquals(1, cart.getItemCount());
    }

    @Test
    void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000);
        cart.addItem("Mouse", 1000);

        assertEquals(51000, cart.calculateTotal());
    }

    @Test
    void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000);

        boolean removed = cart.removeItem("Laptop", 50000);

        assertTrue(removed);
        assertEquals(0, cart.getItemCount());
    }

    @Test
    void testItemCount() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000);
        cart.addItem("Mouse", 1000);
        cart.addItem("Keyboard", 2000);

        assertEquals(3, cart.getItemCount());
    }
}