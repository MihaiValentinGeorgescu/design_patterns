
package org.example.handler;

import org.example.CustomerOrder;

public abstract class OrderValidationHandler {
    protected OrderValidationHandler next;

    public void setNext(OrderValidationHandler next) {
        this.next = next;
    }

    public void validate(CustomerOrder order) {
        if (next != null) {
            next.validate(order);
        }
    }
}