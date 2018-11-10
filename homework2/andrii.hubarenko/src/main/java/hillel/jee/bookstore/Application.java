package hillel.jee.bookstore;

import hillel.jee.bookstore.beans.Book;
import hillel.jee.bookstore.beans.BookStore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context");
        BookStore bookStore = context.getBean(BookStore.class);
        System.out.println("------------------------------------------------------");
        System.out.println(bookStore);
        System.out.println("------------------------------------------------------");
        Book book1 = context.getBean(Book.class,"Edgar Allan Poe", "The Black Cat");
        Book book2 = context.getBean(Book.class,"Edgar Allan Poe", "The Golden Bug");
        Book book3 = context.getBean(Book.class,"William Shakespeare", "Richard, the Lion's Heart");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println("------------------------------------------------------");
        bookStore.addBooks(book1, 10);
        bookStore.addBooks(book2, 15);
        bookStore.addBooks(book3, 1);
        bookStore.getListOfAuthors().forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        bookStore.getListOfAuthorWorks("Edgar Allan Poe").forEach(System.out::println);
        System.out.println(bookStore.getAmountOfBooks("Edgar Allan Poe", "The Black Cat"));
        System.out.println(bookStore.getAmountOfBooks("Edgar Allan Poe", "The Golden Bug"));
        System.out.println(bookStore.getAmountOfBooks("William Shakespeare", "Richard, the Lion's Heart"));
        System.out.println("------------------------------------------------------");
        bookStore.wholeSaleBook("Edgar Allan Poe", "The Black Cat", 8);
        System.out.println(bookStore.getAmountOfBooks("Edgar Allan Poe", "The Black Cat"));
        System.out.println("------------------------------------------------------");
        bookStore.wholeSaleBook("Edgar Allan Poe", "The Black Cat", 8);
        System.out.println("------------------------------------------------------");
        bookStore.sellSingleBook("William Shakespeare", "Richard, the Lion's Heart");
        System.out.println(bookStore.getAmountOfBooks("William Shakespeare", "Richard, the Lion's Heart"));
        bookStore.wholeSaleBook("William Shakespeare", "Hamlet", 1);


    }
}
