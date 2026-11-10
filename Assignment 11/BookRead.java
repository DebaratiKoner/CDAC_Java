
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class BookRead {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("book.dat");

        ObjectInputStream ois = new ObjectInputStream(fis);

        double total = 0;

        Book highest = null;

        for (int i = 1; i <= 5; i++) {

            Book b = (Book) ois.readObject();

            b.display();

            total = total + b.price;

            if (highest == null || b.price > highest.price) {

                highest = b;
            }
        }

        System.out.println("\nHighest Priced Book:");

        highest.display();

        System.out.println("Total Price of All Books: " + total);

        ois.close();
        fis.close();
    }
}
