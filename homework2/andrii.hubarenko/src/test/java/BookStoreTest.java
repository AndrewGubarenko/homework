import hillel.jee.bookstore.beans.Book;
import hillel.jee.bookstore.beans.BookStore;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BookStoreTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("application-context");

    @Test
    public void createStoreTest(){
        BookStore bookStore = context.getBean(BookStore.class);
    }

    @Test
    public void createBookTest(){
        Book book1 = context.getBean(Book.class,"Edgar Allan Poe", "The Black Cat");
        Book book2 = context.getBean(Book.class,"Edgar Allan Poe", "The Golden Bug");
        Book book3 = context.getBean(Book.class,"William Shakespeare", "Richard, the Lion's Heart");
    }

    @Test
    public void addBookTest(){
        BookStore bookStore = context.getBean(BookStore.class);

        Book book1 = context.getBean(Book.class,"Edgar Allan Poe", "The Black Cat");
        Book book2 = context.getBean(Book.class,"Edgar Allan Poe", "The Golden Bug");
        Book book3 = context.getBean(Book.class,"William Shakespeare", "Richard, the Lion's Heart");

        bookStore.addBooks(book1, 10);
        bookStore.addBooks(book2, 15);
        bookStore.addBooks(book3, 1);
    }

    @Test
    public void getListOfAuthorsTest(){
        BookStore bookStore = context.getBean(BookStore.class);

        Book book1 = context.getBean(Book.class,"Edgar Allan Poe", "The Black Cat");
        Book book2 = context.getBean(Book.class,"Edgar Allan Poe", "The Golden Bug");
        Book book3 = context.getBean(Book.class,"William Shakespeare", "Richard, the Lion's Heart");

        bookStore.addBooks(book1, 10);
        bookStore.addBooks(book2, 15);
        bookStore.addBooks(book3, 1);

        List<String> expected = new ArrayList<>();
        expected.add("Edgar Allan Poe");
        expected.add("William Shakespeare");
        List<String> actual = new ArrayList<>();
        actual.addAll(bookStore.getListOfAuthors());

        Assert.assertEquals(expected, actual);

        bookStore.getListOfAuthors().forEach(System.out::println);
    }

    @Test
    public void getListOfAuthorWorksTest(){
        BookStore bookStore = context.getBean(BookStore.class);

        Book book1 = context.getBean(Book.class,"Edgar Allan Poe", "The Black Cat");
        Book book2 = context.getBean(Book.class,"Edgar Allan Poe", "The Golden Bug");

        bookStore.addBooks(book1, 10);
        bookStore.addBooks(book2, 15);

        List<String> expected = new ArrayList<>();
        expected.add("The Golden Bug");
        expected.add("The Black Cat");
        List<String> actual = new ArrayList<>();
        actual.addAll(bookStore.getListOfAuthorWorks("Edgar Allan Poe"));

        Assert.assertEquals(expected, actual);

        bookStore.getListOfAuthorWorks("Edgar Allan Poe").forEach(System.out::println);
    }

    @Test
    public void getAmountOfBooksTest(){
        BookStore bookStore = context.getBean(BookStore.class);

        Book book1 = context.getBean(Book.class,"Edgar Allan Poe", "The Black Cat");
        Book book2 = context.getBean(Book.class,"Edgar Allan Poe", "The Golden Bug");
        Book book3 = context.getBean(Book.class,"William Shakespeare", "Richard, the Lion's Heart");

        bookStore.addBooks(book1, 10);
        bookStore.addBooks(book2, 15);
        bookStore.addBooks(book3, 1);

        Assert.assertEquals(10, bookStore.getAmountOfBooks("Edgar Allan Poe", "The Black Cat"));
        Assert.assertEquals(15, bookStore.getAmountOfBooks("Edgar Allan Poe", "The Golden Bug"));
        Assert.assertEquals(1, bookStore.getAmountOfBooks("William Shakespeare", "Richard, the Lion's Heart"));
    }

    @Test
    public void wholeSaleBookTest(){
        BookStore bookStore = context.getBean(BookStore.class);

        Book book1 = context.getBean(Book.class,"Edgar Allan Poe", "The Black Cat");
        Book book2 = context.getBean(Book.class,"Edgar Allan Poe", "The Golden Bug");
        Book book3 = context.getBean(Book.class,"William Shakespeare", "Richard, the Lion's Heart");

        bookStore.addBooks(book1, 10);
        bookStore.addBooks(book2, 15);
        bookStore.addBooks(book3, 1);

        Assert.assertEquals(10, bookStore.getAmountOfBooks("Edgar Allan Poe", "The Black Cat"));

        bookStore.wholeSaleBook("Edgar Allan Poe", "The Black Cat", 8);

        Assert.assertEquals(2, bookStore.getAmountOfBooks("Edgar Allan Poe", "The Black Cat"));

        bookStore.wholeSaleBook("Edgar Allan Poe", "The Black Cat", 8);

    }

    @Test
    public void sellSingleBookTest(){
        BookStore bookStore = context.getBean(BookStore.class);

        Book book3 = context.getBean(Book.class,"William Shakespeare", "Richard, the Lion's Heart");

        bookStore.addBooks(book3, 1);
        Assert.assertEquals(1, bookStore.getAmountOfBooks("William Shakespeare", "Richard, the Lion's Heart"));

        bookStore.sellSingleBook("William Shakespeare", "Richard, the Lion's Heart");
        Assert.assertEquals(0, bookStore.getAmountOfBooks("William Shakespeare", "Richard, the Lion's Heart"));
    }

}
