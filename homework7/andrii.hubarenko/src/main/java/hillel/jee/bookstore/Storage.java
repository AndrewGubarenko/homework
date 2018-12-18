package hillel.jee.bookstore;

public class Storage {

    private BookStore store = new BookStore();

    private AuthorShelfOfWorks checkAuthorShelf(String authorName) {
        AuthorShelfOfWorks shelf = store.getBookStore().get(authorName);
        if (shelf == null) {
            AuthorShelfOfWorks newShelf = new AuthorShelfOfWorks( authorName);
            return newShelf;
        }
        return shelf;
    }

    public BookStore fillStore() {
        Book book1 = new Book("Edgar Allan Poe", "The Black Cat");
        Book book2 = new Book("Edgar Allan Poe", "The Golden Bug");
        Book book3 = new Book("William Shakespeare", "Richard, the Lion's Heart");
        Magazine mag1 = new Magazine("Men's Health", 1);
        Magazine mag2 = new Magazine("Men's Health", 2);
        Magazine mag3 = new Magazine("Men's Health", 3);

        store.addEditions(mag1, checkAuthorShelf(mag1.getAuthor()), 100);
        store.addEditions(mag1, checkAuthorShelf(mag1.getAuthor()), 100);
        store.addEditions(mag2, checkAuthorShelf(mag2.getAuthor()), 150);
        store.addEditions(mag3, checkAuthorShelf(mag3.getAuthor()), 10);
        store.addEditions(book1, checkAuthorShelf(book1.getAuthor()), 10);
        store.addEditions(book2, checkAuthorShelf(book2.getAuthor()), 15);
        store.addEditions(book3, checkAuthorShelf(book3.getAuthor()), 1);

        return store;
    }
}
