package constructors.library;

import constructors.Line;

public class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(new Author("Hovhannes", "Tumanyan", 1869, 1923), "Dog and cat", 1882, 10));
        library.addBook(new Book(new Author("Hovhannes", "Tumanyan", 1869, 1923), "Parvana", 1900, 10));
        library.addBook(new Book(new Author("Hovhannes", "Tumanyan", 1869, 1923), "Giqor", 1900, 20));

        library.getBookNames();
        library.searchBook("Giqor");

    }
}
