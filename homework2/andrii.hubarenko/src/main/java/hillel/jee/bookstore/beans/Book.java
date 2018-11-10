package hillel.jee.bookstore.beans;

import java.util.Objects;

public class Book {
    private String author;
    private String bookName;
    private int count;

    public Book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

/*    public void setAuthor(String author) {
        this.author = author;
    }*/

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

/*    public void setBookName(String bookName) {
        this.bookName = bookName;
    }*/

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "hillel.bookstore.Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName);
    }
}
