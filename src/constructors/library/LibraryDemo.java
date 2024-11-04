package constructors.library;

import java.util.Scanner;
import constructors.Line;

public class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(new Author("Hovhannes", "Tumanyan", 1869, 1923), "Dog and cat", 1882, 10));
        library.addBook(new Book(new Author("Hovhannes", "Tumanyan", 1869, 1923), "Parvana", 1900, 10));
        library.addBook(new Book(new Author("Hovhannes", "Tumanyan", 1869, 1923), "Giqor", 1900, 20));

        library.getBookNames();
        library.searchBook("Giqor");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 0, 1 or 2.");
        int number = scanner.nextInt();
        switch (number) {
            case (0) : break;
            case (1) : library.getBookNames();
            case (2) :
                System.out.println("input book's name");
                library.searchBook( scanner.nextLine());
        }
    }
}
