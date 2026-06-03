public class Book10 {
    public String isbn;
    public String title;

    public Book10() {

    }

    public Book10(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return " ISBN: " + this.isbn + " Title: " + this.title;
    }
}