package org.example.command;

import org.example.CustomerOrder; // Import your CustomerOrder entity
import org.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // This annotation makes the class a Spring-managed bean
public class PlaceOrderCommand {
    private final OrderRepository orderRepository;

    // Constructor injection with @Autowired
    @Autowired
    public PlaceOrderCommand(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void execute(String customerName, Integer quantity, String status, Double totalAmount) {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerName(customerName);
        order.setQuantity(quantity);
        order.setStatus(status);
        order.setTotalAmount(totalAmount);
        orderRepository.save(order); // Save order to the repository
    }
}
