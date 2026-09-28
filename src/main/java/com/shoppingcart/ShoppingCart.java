package com.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<String> items;
    private double total;

    public ShoppingCart() {
        items = new ArrayList<>();
        total = 0.0;
    }

    public void addItem(String item, double price) {
        if (item == null || item.isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be empty");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        items.add(item);
        total += price;
    }

    public boolean removeItem(String item, double price) {
        if (items.contains(item)) {
            items.remove(item);
            total -= price;
            return true;
        }

        return false;
    }

    public double calculateTotal() {
        return total;
    }

    public int getItemCount() {
        return items.size();
    }
}