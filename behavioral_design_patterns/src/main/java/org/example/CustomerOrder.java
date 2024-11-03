//package org.example;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String customerName;
//    private String status;
//    private double totalAmount;
//
//
//    private String product;
//    private int quantity;
//
//    // Constructors, getters and setters
//
//    public Order() {}
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getProduct() {
//        return product;
//    }
//
//    public void setProduct(String product) {
//        this.product = product;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public void updateStatus(String newStatus) {
//        this.status = newStatus;
//        System.out.println("Order " + id + " status updated to: " + newStatus);
//    }
//
//    public double getTotalAmount() {
//        return totalAmount;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setTotalAmount(double totalAmount) {
//        this.totalAmount = totalAmount;
//    }
//}
package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName; // Add this field
    private double totalAmount;  // Add this field

    // Constructors, getters and setters
    private String status;
    private int quantity;

    public CustomerOrder() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Order " + id + " status updated to: " + newStatus);
    }

        public void setStatus(String newStatus) {
        this.status = newStatus;
    }
}
