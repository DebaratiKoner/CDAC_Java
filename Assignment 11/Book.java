
import java.io.Serializable;

public class Book implements Serializable {

    int bookId;
    String bookName;
    String author;
    double price;

    Book(int bookId, String bookName, String author, double price) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    void display() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + author);
        System.out.println("Book Price: " + price);
        System.out.println("----------------------");
    }
}
