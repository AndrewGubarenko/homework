package hillel.jee.bookstore;

/**
 * {@link Book} is a specific object, subclass of PrintEdition class.
 */

public class Book extends PrintEdition{
    public Book(String author, String bookName) {
        super(author, bookName);
    }
}
