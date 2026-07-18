package Task3;

public class Book {
    private String title;
    private String author;
    private int publicYear;

    public Book(String title, String author, int publicYear) {
        this.title = title;
        this.author = author;
        this.publicYear = publicYear;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}


