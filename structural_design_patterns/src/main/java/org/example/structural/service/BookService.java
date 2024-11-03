package org.example.structural.service;

import org.example.structural.entity.Book;
import org.example.structural.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookById(Long id) {
        // Retrieve a book by ID or throw an exception if not found
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id " + id));
    }

    public Book updateBook(Long id, Book updatedBook) {
        // Update an existing book's information
        Book existingBook = getBookById(id);
        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setPrice(updatedBook.getPrice());
        return bookRepository.save(existingBook);
    }

    public void deleteBook(Long id) {
        // Delete a book by ID
        bookRepository.deleteById(id);
    }
}
