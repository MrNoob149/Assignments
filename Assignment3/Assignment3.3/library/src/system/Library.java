package system;
import model.Book;
import model.LibraryMember;
import java.util.LinkedList;

public class Library {
       private LinkedList<Book> library = new LinkedList<Book>();
       private LinkedList<LibraryMember> libraryList = new LinkedList<>();
       private LinkedList<Book> reservedBooks = new LinkedList<>();

    public void addBook(Book book) {
        library.add(book);
        // Add book to the library

    }

    public void addMember(LibraryMember member) {
        libraryList.add(member);
        // Add member to the library

    }

    public void borrowBook(LibraryMember member, Book book) {
        library.remove(book);
        member.getBorrowedBooks().add(book);
        // Borrow book from the library

    }

    public void returnBook(LibraryMember member, Book book) {
        member.getBorrowedBooks().remove(book);
        library.add(book);
        // Return book to the library
    }

    public LinkedList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(LinkedList<Book> library) {
        this.library = library;
    }

    public LinkedList<LibraryMember> getLibraryList() {
        return libraryList;
    }

    public void setLibraryList(LinkedList<LibraryMember> libraryList) {
        this.libraryList = libraryList;
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
}}