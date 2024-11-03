package org.example.handler;

import org.example.CustomerOrder;
import org.springframework.stereotype.Component;

@Component
public class PaymentValidationHandler extends OrderValidationHandler {
    @Override
    public void validate(CustomerOrder order) {
        // Validate payment details
        boolean paymentValid = validatePaymentDetails(order); // Placeholder for actual validation logic

        if (paymentValid) {
            System.out.println("Payment validation passed for Order ID: " + order.getId());
            super.validate(order); // Proceed to the next handler
        } else {
            System.out.println("Payment validation failed for Order ID: " + order.getId());
            throw new RuntimeException("Payment details are invalid."); // Throw an exception if invalid
        }
    }

    private boolean validatePaymentDetails(CustomerOrder order) {
        // Placeholder for actual payment validation logic
        return true; // Assume it's valid for now
    }
}
