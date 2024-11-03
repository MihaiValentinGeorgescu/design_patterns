package org.example.structural.service;

import org.example.structural.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibraryFacade {

    private final BookService bookService;

    @Autowired
    public LibraryFacade(BookService bookService) {
        this.bookService = bookService;
    }

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public List<FeaturedBookDecorator> getFeaturedBooks() {
        // Retrieve a list of books marked as "Featured" (using a decorator to add this functionality)
        return bookService.getAllBooks().stream()
                .map(FeaturedBookDecorator::new)
                .collect(Collectors.toList());
    }
}
