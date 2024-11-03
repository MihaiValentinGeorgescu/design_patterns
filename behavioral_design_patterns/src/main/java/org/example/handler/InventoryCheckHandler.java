package org.example.handler;

import org.example.CustomerOrder;
import org.springframework.stereotype.Component;

@Component
public class InventoryCheckHandler extends OrderValidationHandler {

    @Override
    public void validate(CustomerOrder order) {
        // Simulating an inventory check
        boolean inStock = checkInventory(order); // Simulate the inventory check

        if (inStock) {
            System.out.println("Inventory check passed for Order ID: " + order.getId());
            super.validate(order); // Proceed to the next handler
        } else {
            System.out.println("Inventory check failed for Order ID: " + order.getId());
            throw new RuntimeException("Items are out of stock."); // Throw an exception if out of stock
        }
    }

    // Simulated inventory check logic
    private boolean checkInventory(CustomerOrder order) {
        // Placeholder logic for demonstration purposes
        return order.getTotalAmount() < 100; // Example: orders under $100 are always in stock
    }
}
