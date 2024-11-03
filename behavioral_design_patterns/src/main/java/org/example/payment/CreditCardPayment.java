package org.example.payment;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        // Implement credit card payment logic
        System.out.println("Paid $" + amount + " with Credit Card."); // Using System.out for output
        // Here you would integrate with an actual payment processor
    }
}
