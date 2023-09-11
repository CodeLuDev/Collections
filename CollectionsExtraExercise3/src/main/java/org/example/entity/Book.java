package org.example.entity;

public class Book {

    private String title;
    private String author;
    private int numberOfCopies;
    private int numberOfCopiesBorrowed;

    public Book() {
    }

    public Book(String title, String author, int numberOfCopies, int numberOfCopiesBorrowed) {
        this.title = title;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
        this.numberOfCopiesBorrowed = numberOfCopiesBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getNumberOfCopiesBorrowed() {
        return numberOfCopiesBorrowed;
    }

    public void setNumberOfCopiesBorrowed(int numberOfCopiesBorrowed) {
        this.numberOfCopiesBorrowed = numberOfCopiesBorrowed;
    }
}
