
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BookWrite {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        FileOutputStream fos = new FileOutputStream("book.dat");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter Book " + i + " Details");

            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Book Name: ");
            String bookName = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            System.out.print("Enter Book Price: ");
            double price = sc.nextDouble();

            Book b = new Book(bookId, bookName, author, price);

            oos.writeObject(b);
        }

        System.out.println("All Book Details Saved Successfully");

        oos.close();
        fos.close();
        sc.close();
    }
}
