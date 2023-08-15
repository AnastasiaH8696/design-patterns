package com.dao.example;

import java.util.List;

public interface BookDao {
    List<Book> getBooks();
    Book getBook(int bookId);
    void addBook(Book book);
    void editBook(int bookId, Book updated);
    void deleteBook(Book toDelete);
}
