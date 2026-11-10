package cdac;
import java.util.ArrayList;
import java.util.Scanner;

public class Book_Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Book Inventory Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Update Book Price");
            System.out.println("5. Delete Book");
            System.out.println("6. Total Number of Books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Book Price: ");
                    double price = sc.nextDouble();

                    books.add(new Book(id, title, author, price));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } else {
                        System.out.println("Book Inventory:");
                        for (Book b : books) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Book b : books) {
                        if (b.bookId == searchId) {
                            System.out.println("Book Found:");
                            b.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to update price: ");
                    int updateId = sc.nextInt();
                    found = false;

                    for (Book b : books) {
                        if (b.bookId == updateId) {
                            System.out.print("Enter new price: ");
                            b.price = sc.nextDouble();
                            System.out.println("Book price updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).bookId == deleteId) {
                            books.remove(i);
                            System.out.println("Book deleted successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Total number of books: "
                            + books.size());
                    break;

                case 7:
                    System.out.println("Exiting Book Inventory System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
