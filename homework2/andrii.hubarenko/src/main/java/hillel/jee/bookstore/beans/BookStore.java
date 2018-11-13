package hillel.jee.bookstore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * {@link BookStore} is a controller, using for creating, adding, storing, getting and selling
 * of print editions
 */
public class BookStore {

    Map<String, AuthorShelfOfWorks> bookStore;

    public BookStore() {
        bookStore = new HashMap<>();
    }

    /**
     * {@link PrintEdition} is a method using for adding a single edition to the storage
     * @param edition you are going to add
     * @return PrintEdition edition
     */
    private PrintEdition addNewEditions(PrintEdition edition) {
        String author = edition.getAuthor();
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/Store-context");
        AuthorShelfOfWorks authorShelfOfWorks = context.getBean(AuthorShelfOfWorks.class, author);
        authorShelfOfWorks.getShelf().put(edition.getEditionName(), edition);
        bookStore.put(author, authorShelfOfWorks);
        return edition;
    }

    /**
     * {@link PrintEdition} is a method using for adding a certain amount of editions
     * @param edition you are going to add
     * @param amountOfEditions is an amount of editions you are going to add
     * @return PrintEdition edition
     */
    public PrintEdition addEditions(PrintEdition edition, int amountOfEditions) {
        if(amountOfEditions <= 0) {
            System.out.println("Incorrect numbers of editions!");
            return null;
        }
        String author = edition.getAuthor();
        String editionName = edition.getEditionName();
        AuthorShelfOfWorks authorShelfOfWorks = bookStore.get(author);

        if(authorShelfOfWorks != null && authorShelfOfWorks.getShelf().get(editionName) != null) {
            authorShelfOfWorks.getShelf().get(editionName).setCount(amountOfEditions);
        } else if (authorShelfOfWorks != null && authorShelfOfWorks.getShelf().get(editionName) == null) {
            edition.setCount(amountOfEditions);
            authorShelfOfWorks.getShelf().put(editionName, edition);
        } else {
            edition.setCount(amountOfEditions);
            addNewEditions(edition);
        }
        return edition;
    }

    /**
     * findEdition is a method using for searching specific edition by author and edition name
     * @param author of edition
     * @param editionName is a name of edition
     * @return PrintEdition or null
     */
    public PrintEdition findEdition(String author, String editionName) {
        return bookStore.get(author).getShelf().get(editionName);
    }

    /**
     * getListOfAuthors is a method for getting a set of all author's names
     * @return String Set of author's names
     */
    public Set<String> getListOfAuthors() {
        return bookStore.keySet();
    }

    /**
     * getListOfAuthorWorks is a method for getting a set of all author's works
     * @param authorName
     * @return String Set of author's works
     */
    public Set<String> getListOfAuthorWorks(String authorName) {
        return bookStore.get(authorName).getShelf().keySet();
    }

    /**
     * getAmountOfEditions is a method for getting amount of specified edition
     * @param author name of author
     * @param editionName name of edition
     * @return int amount of specified edition
     */
    public int getAmountOfEditions(String author, String editionName) {
        return findEdition(author, editionName).getCount();
    }

    /**
     * sellSingleEdition is a method for selling a single edition, specified by author's name and edition name
     * @param author author's name
     * @param editionName edition name
     * @return PrintEdition sold edition
     */
    public PrintEdition sellSingleEdition(String author, String editionName) {
        PrintEdition authorWork = findEdition(author, editionName);
        if(authorWork != null && authorWork.getCount() != 0) {
            return wholeSaleBook(author, editionName, 1);
        }
        System.out.println("The book doesn't exist!");
        return null;
    }

    /**
     * wholeSaleBook is a method for selling a single edition, specified by author's name and edition name
     * @param author author's name
     * @param editionName edition name
     * @param amountOfEditions amount of requested editions
     * @return PrintEdition sold edition
     */
    public PrintEdition wholeSaleBook(String author, String editionName, int amountOfEditions) {
        PrintEdition authorWork = findEdition(author, editionName);
        if(authorWork == null) {
            System.out.println("The edition has been not found!");
            return null;
        }
        if (authorWork.getCount() < amountOfEditions) {
            System.out.println("Not enough editions!");
            return null;
        }
        if(authorWork != null && authorWork.getCount() >= amountOfEditions) {
            authorWork.setCount(-amountOfEditions);
            return authorWork;
        }
        return null;
    }
}
