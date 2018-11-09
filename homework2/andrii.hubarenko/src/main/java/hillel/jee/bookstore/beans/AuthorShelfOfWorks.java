package hillel.jee.bookstore.beans;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AuthorShelfOfWorks {
    private Map<String, Book> shelf;
    private String authorName;

    public AuthorShelfOfWorks(String AuthorName) {
        this.authorName = AuthorName;
        shelf = new HashMap<>();
    }

    public Map<String, Book> getShelf() {
        return shelf;
    }

    public void setShelf(Map<String, Book> shelf) {
        this.shelf = shelf;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "AuthorShelfOfWorks{" +
                "shelf=" + shelf +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorShelfOfWorks that = (AuthorShelfOfWorks) o;
        return Objects.equals(shelf, that.shelf) &&
                Objects.equals(authorName, that.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelf, authorName);
    }
}
