package hillel.jee.bookstore.beans;

import hillel.jee.bookstore.BookStoreConfiguration;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BookStore {

    Map<String, AuthorShelfOfWorks> bookStore;

    public BookStore() {
        bookStore = new HashMap<>();
    }

    private Book addNewBooks(Book book) {
        String author = book.getAuthor();
        BookStoreConfiguration context = new BookStoreConfiguration();
        AuthorShelfOfWorks authorShelfOfWorks = context.authorShelfOfWorks(author);
        authorShelfOfWorks.getShelf().put(book.getBookName(), book);
        bookStore.put(author, authorShelfOfWorks);
        return book;
    }

    public Book addBooks(Book book, int amountOfBooks) {
        if(amountOfBooks <= 0) {
            System.out.println("Incorrect numbers of books!");
            return null;
        }
        String author = book.getAuthor();
        String bookName = book.getBookName();
        AuthorShelfOfWorks authorShelfOfWorks = bookStore.get(author);

        if(authorShelfOfWorks != null && authorShelfOfWorks.getShelf().get(bookName) != null) {
            authorShelfOfWorks.getShelf().get(bookName).setCount(amountOfBooks);
        } else if (authorShelfOfWorks != null && authorShelfOfWorks.getShelf().get(bookName) == null) {
            book.setCount(amountOfBooks);
            authorShelfOfWorks.getShelf().put(bookName, book);
        } else {
            book.setCount(amountOfBooks);
            addNewBooks(book);
        }
        return book;
    }

    public Book findBook(String author, String bookName) {
        return bookStore.get(author).getShelf().get(bookName);
    }

    public Set<String> getListOfAuthors() {
        return bookStore.keySet();
    }

    public Set<String> getListOfAuthorWorks(String authorName) {
        return bookStore.get(authorName).getShelf().keySet();
    }

    public int getAmountOfBooks(String author, String bookName) {
        return findBook(author, bookName).getCount();
    }

    public Book sellSingleBook(String author, String bookName) {
        Book authorWork = findBook(author, bookName);
        if(authorWork != null && authorWork.getCount() != 0) {
            return wholeSaleBook(author, bookName, 1);
        }
        System.out.println("The book doesn't exist!");
        return null;
    }

    public Book wholeSaleBook(String author, String bookName, int amountOfBooks) {
        Book authorWork = findBook(author, bookName);
        if(authorWork == null) {
            System.out.println("The book has been not found!");
            return null;
        }
        if (authorWork.getCount() < amountOfBooks) {
            System.out.println("Not enough books!");
            return null;
        }
        if(authorWork != null && authorWork.getCount() >= amountOfBooks) {
            authorWork.setCount(-amountOfBooks);
            return authorWork;
        }
        return null;
    }
}
