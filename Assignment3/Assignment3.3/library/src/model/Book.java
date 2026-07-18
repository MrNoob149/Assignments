package model;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean reserved; // for task 3


public Book(String title, String author, String ISBN) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.reserved = false;
    }

    public String getTitle() {
    return title;
    }

    public String getAuthor() {
    return author;
    }

    public String getISBN() {
    return ISBN;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return title + "by " + author + "(ISBN " + ISBN + ")";
    }

}