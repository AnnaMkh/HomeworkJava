package constructors.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(String bookName) {
        for (Book book : books) {
            if (book.getAuthor().equals(bookName)) {
                return book;
            }
        }
        return null;
    }

    public String[] getBookNames() {
        String[] bookNames = new String[books.size()];
        for (int i = 0; i < books.size(); i++) {
            bookNames[i] = books.get(i).getNameOfBook();

        }
        return bookNames;
    }
}
