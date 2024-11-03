package org.example.structural.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.structural.service.BookDecorator;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements BookDecorator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private double price;

    @Override
    public String getDescription() {
        return title + " by " + author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Explicitly add setters for title, author, and price if Lombok is not generating them
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
