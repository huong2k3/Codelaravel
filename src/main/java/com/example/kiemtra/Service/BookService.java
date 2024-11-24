package com.example.kiemtra.Service;

import com.example.kiemtra.Entity.Book;
import com.example.kiemtra.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

        @Autowired
        private BookRepository bookRepository;

        // Create or Update Book
        public Book saveBook(Book book) {
            return bookRepository.save(book);
        }

        // Read Book by ID
        public Optional<Book> getBookById(Integer id) {
            return bookRepository.findById(id);
        }

        // Get all Books
        public List<Book> getAllBooks() {
            return bookRepository.findAll();
        }

        // Delete Book by ID
        public void deleteBook(Integer id) {
            bookRepository.deleteById(id);
        }

    // Tìm kiếm sách theo tên tác giả
    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }


}
