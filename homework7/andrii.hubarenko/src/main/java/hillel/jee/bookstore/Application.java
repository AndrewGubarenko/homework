package hillel.jee.bookstore;


public class Application {

    public static BookStore store = new Storage().fillStore();

    public static void main(String[] args) {

        System.out.println("Starting of BookStore");
    }

}
