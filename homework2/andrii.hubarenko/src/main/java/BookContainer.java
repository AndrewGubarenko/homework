import java.util.Objects;

public class BookContainer {
    private Book book;
    private int count;

    public BookContainer(Book book, int count) {
        this.book = book;
        this.count += count;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "BookContainer{" +
                "book=" + book +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookContainer that = (BookContainer) o;
        return count == that.count &&
                Objects.equals(book, that.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, count);
    }
}
