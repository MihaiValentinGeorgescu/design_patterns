package org.example;

import org.example.command.PlaceOrderCommand;
import org.example.handler.InventoryCheckHandler;
import org.example.handler.PaymentValidationHandler;
import org.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext; // To get beans

    @Autowired
    private PlaceOrderCommand placeOrderCommand; // Inject the PlaceOrderCommand bean

    @Autowired
    private OrderRepository orderRepository; // Inject your OrderRepository

    @Override
    public void run(String... args) {
        // Example usage of PlaceOrderCommand
        String customerName = "John Doe";
        Double totalAmount = 50.0;
        Integer quantity = 1; // Set a quantity
        String status = "NEW"; // Set a default status

        // Place the order using the PlaceOrderCommand
        placeOrderCommand.execute(customerName, quantity, status, totalAmount);

        // Example of inventory and payment validation handlers
        InventoryCheckHandler inventoryCheckHandler = applicationContext.getBean(InventoryCheckHandler.class);
        PaymentValidationHandler paymentValidationHandler = applicationContext.getBean(PaymentValidationHandler.class);

        // Set the chain of responsibility
        inventoryCheckHandler.setNext(paymentValidationHandler);

        // Validate the order
        // Assuming you want to validate the last order placed
        // Here you may need to retrieve the order from the repository if needed
        // inventoryCheckHandler.validate(order); // Uncomment this if needed
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
