package model;

import system.Library;

import java.util.ArrayList;
import java.util.List;


public class LibraryMember {
    private String name;
    private int memberID;

    private ArrayList<Book> BorrowedBooks = new ArrayList<Book>();
    private List<Book> reservedBooks = new ArrayList<>();


    public LibraryMember(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return BorrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        BorrowedBooks = borrowedBooks;
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

    @Override
    public String toString() {
        return name + " with id " + memberID + " has borrowed ";
    }

}
