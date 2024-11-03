package org.example.structural.service;

import org.example.structural.entity.Book;

public class BestsellerBookDecorator implements BookDecorator {
    private final Book book;

    public BestsellerBookDecorator(Book book) {
        this.book = book;
    }

    @Override
    public String getDescription() {
        return "[Bestseller] " + book.getDescription();
    }

    @Override
    public double getPrice() {
        return book.getPrice();
    }
}