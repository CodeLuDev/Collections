package org.example.service;

import org.example.entity.Book;

import java.util.HashSet;

public class BookService {

    HashSet<Book> bookSet;

    public BookService() {
        bookSet = new HashSet<>();
    }

    public HashSet<Book> getBookSet() {
        return bookSet;
    }

    public Book createAndAddBook(String title, String author, int numberOfCopies, int numberOfCopiesBorrowed) {
        Book book = new Book();

        book.setTitle(title);
        book.setAuthor(author);
        book.setNumberOfCopies(numberOfCopies);
        book.setNumberOfCopiesBorrowed(numberOfCopiesBorrowed);

        bookSet.add(book);
        return book;
    }

    public boolean borrowBook(String title) {
        boolean success = false;
        for (Book book : bookSet) {
            if (book.getTitle().equals(title) && book.getNumberOfCopiesBorrowed() > 0) {
                book.setNumberOfCopies(book.getNumberOfCopies() - 1);
                book.setNumberOfCopiesBorrowed(book.getNumberOfCopiesBorrowed() + 1);
                success =  true;
            }
            if (success) {
                break;
            }
        }
        return success;
    }

    public boolean returnBook(String title) {
        boolean success = false;
        for (Book book : bookSet) {
            if (book.getTitle().equals(title) && book.getNumberOfCopiesBorrowed() > 0) {
                book.setNumberOfCopies(book.getNumberOfCopies() + 1);
                book.setNumberOfCopiesBorrowed(book.getNumberOfCopiesBorrowed() - 1);
                success =  true;
            }
            if (success) {
                break;
            }
        }
        return success;
    }
}
