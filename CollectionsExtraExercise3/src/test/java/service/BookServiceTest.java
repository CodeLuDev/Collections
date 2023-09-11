package service;

import org.example.entity.Book;
import org.example.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookServiceTest {

    @Test
    public void verifyCreateAndAddBookTest() {

        BookService bookService = new BookService();

        Book b1 = bookService.createAndAddBook("Pride and Prejudice","Jane Austen",100,10);
        Book b2 = bookService.createAndAddBook("To Kill a Mockingbird","Harper Lee",80,5);
        Book b3 = bookService.createAndAddBook("1984","George Orwell",120,20);
        Book b4 = bookService.createAndAddBook("The Great Gatsby","F. Scott Fitzgerald",90,15);
        Book b5 = bookService.createAndAddBook("Moby-Dick","Herman Melville",70,8);

        Assertions.assertEquals(5,bookService.getBookSet().size());
    }

    @Test
    public void verifyBorrowBookTest() {

        BookService bookService = new BookService();

        Book b1 = bookService.createAndAddBook("Pride and Prejudice","Jane Austen",100,10);
        Book b2 = bookService.createAndAddBook("To Kill a Mockingbird","Harper Lee",80,5);
        Book b3 = bookService.createAndAddBook("1984","George Orwell",120,20);
        Book b4 = bookService.createAndAddBook("The Great Gatsby","F. Scott Fitzgerald",90,15);
        Book b5 = bookService.createAndAddBook("Moby-Dick","Herman Melville",70,8);

        boolean answerExpected = bookService.borrowBook("1984");

        Assertions.assertEquals(21,b3.getNumberOfCopiesBorrowed());
        Assertions.assertTrue(answerExpected);
    }

    @Test
    public void verifyReturnBookTest() {

        BookService bookService = new BookService();

        Book b1 = bookService.createAndAddBook("Pride and Prejudice","Jane Austen",100,10);
        Book b2 = bookService.createAndAddBook("To Kill a Mockingbird","Harper Lee",80,5);
        Book b3 = bookService.createAndAddBook("1984","George Orwell",120,20);
        Book b4 = bookService.createAndAddBook("The Great Gatsby","F. Scott Fitzgerald",90,15);
        Book b5 = bookService.createAndAddBook("Moby-Dick","Herman Melville",70,8);

        boolean answerExpected = bookService.returnBook("Moby-Dick");

        Assertions.assertEquals(7,b5.getNumberOfCopiesBorrowed());
        Assertions.assertTrue(answerExpected);
    }
}
