package Task1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {

        System.out.println("Library Catalog:");

        for (int i = 0; i < books.size(); i++) {

            Book book = books.get(i);

            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getPublicYear());
        }
        System.out.println();
    }
    public void findBooksByAuthor(String author) {

        System.out.println("Books by Author " + author + ":");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: " + book.getTitle() + ", Year: " + book.getPublicYear());
            }
        }
        System.out.println();
    }


}
