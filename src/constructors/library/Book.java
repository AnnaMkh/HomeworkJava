package constructors.library;

public class Book {
    private Author author;
    private String nameOfBook;
    private int year;
    private int numberOfPages;

    public Book(Author author, String nameOfBook, int year, int numberOfPages) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
