import model.LibraryMember;
import model.Book;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book mybook = new Book("Sherlock", "Idk", "23842342");
        LibraryMember mylibrarymember = new LibraryMember("Jack", 1);
        Book mybook1 = new Book("Percy Jacksoon", "random", "12345667");
        LibraryMember mylibrarymember1 = new LibraryMember("John", 2);


        myLibrary.getLibrary().add(mybook);
        myLibrary.getLibraryList().add(mylibrarymember);

        myLibrary.borrowBook(mylibrarymember, mybook);
        myLibrary.returnBook(mylibrarymember, mybook);

        myLibrary.borrowBook(mylibrarymember1, mybook1);
        myLibrary.returnBook(mylibrarymember1, mybook1);

        myLibrary.reserveBook(mylibrarymember1, mybook1);
        myLibrary.reserveBook(mylibrarymember, mybook);

        myLibrary.displayReservedBooks(mylibrarymember1);
        myLibrary.displayReservedBooks(mylibrarymember);

        myLibrary.cancelReservation(mylibrarymember1, mybook1);

        myLibrary.displayReservedBooks(mylibrarymember1);



        System.out.println("Completed");



        // Create instances of Library, Book, LibraryMember
        // Add books and members to the library
        // Perform borrowing and returning operations
    }
}