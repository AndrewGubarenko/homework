import java.util.HashMap;
import java.util.Map;

public class BookStore {
    Map<String, Map<String, BookContainer>> bookStore;

    BookStore() {
        bookStore = new HashMap<>();
    }

    private Book addNewBooks(Book book, int num) {
        if(num <= 0) {
            System.out.println("Incorrect numbers of books!");
            return null;
        }
        BookContainer bookContainer = new BookContainer(book, num);
        Map<String, BookContainer> AuthorBookList = new HashMap<>();
        AuthorBookList.put(book.getBookName(), bookContainer);
        bookStore.put(book.getAuthor(), AuthorBookList);
        return book;
    }

    public Book addBooks(Book book, int num) {
        Map<String, BookContainer> listOfAuthorBooks = bookStore.get(book.getAuthor());

        if(listOfAuthorBooks != null && listOfAuthorBooks.get(book.getBookName()) != null) {
            listOfAuthorBooks.get(book.getBookName()).setCount(listOfAuthorBooks.get(book.getBookName()).getCount() + num);
        } else if (listOfAuthorBooks != null && listOfAuthorBooks.get(book.getBookName()) == null) {
            listOfAuthorBooks.put(book.getBookName(), new BookContainer(book, num));
        } else {
            addNewBooks(book, num);
        }
        return book;
    }

    public Book findBook(String author, String bookName) {
        return bookStore.get(author).get(bookName).getBook();
    }

    public Book sellSingleBook(Book book, int num) {
        if((findBook(book.getAuthor(), book.getBookName()) != null)) {
            return wholeSaleBook(book.getAuthor(), book.getBookName(), 1);
        }
        System.out.println("The book doesn't exist!");
        return null;
    }

    public Book wholeSaleBook(String author, String bookName, int num) {
        if((findBook(author, bookName) != null)) {
            bookStore.get(author).get(bookName).setCount(bookStore.get(author).get(bookName).getCount() + num);
            return findBook(author, bookName);
        }
        System.out.println("The book doesn't exist!");
        return null;
    }
}
