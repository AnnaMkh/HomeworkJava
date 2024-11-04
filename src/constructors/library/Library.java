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

    public Book searchBook(String bookName) {
        for (Book book : books) {
            if (book.getNameOfBook().equals(bookName)) {
                System.out.println("Book: " + book.getNameOfBook());
                return book;
            }
        } return null;
    }

    public void getBookNames() {
        String[] bookNames = new String[books.size()];
        for (int i = 0; i < books.size(); i++) {
            System.out.println(bookNames[i] = books.get(i).getNameOfBook());
        }
    }
}
