package com.dao.example;

import java.util.ArrayList;
import java.util.List;

public class BookDaoIml implements BookDao {
    List<Book> books;

    public BookDaoIml() {
        this.books = new ArrayList<>();
        //Dummy data for demo
        this.books.add(new Book(111, "Book1", "Author1", 222, 2));
        this.books.add(new Book(333, "Book2", "Author2", 444, 6));
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Book getBook(int bookId) {
        for (Book book: books) {
            if (book.getId() == bookId)
                return book;
        }
        return null;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);

    }

    @Override
    public void editBook(int bookId, Book updated) {
        for (Book book: books) {
            if (book.getId() == bookId) {
                book.setCount(updated.getCount());
                book.setAuthorId(updated.getAuthorId());
                book.setAuthorName(updated.getAuthorName());
                book.setName(updated.getName());
                break;
            }
        }
    }

    @Override
    public void deleteBook(Book toDelete) {
        books.remove(toDelete);
    }

    public void printBooks() {
        System.out.println("Books:");
        for (Book book: books){
            System.out.println(book);
        }
    }
}
