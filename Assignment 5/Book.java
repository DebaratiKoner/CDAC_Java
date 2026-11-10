
class Book {
    int bookId;
    String bookTitle;
    String authorName;
    double price;

    static int bookCount = 0;
    static String storeName = "Knowledge Book Store";

    Book(int id, String title, String author, double price) {
        bookId = id;
        bookTitle = title;
        authorName = author;
        this.price = price;
        bookCount++;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Book[] b = new Book[5];

        b[0] = new Book(1, "Java Basics", "James", 450);
        b[1] = new Book(2, "Python Guide", "John", 550);
        b[2] = new Book(3, "C Programming", "Dennis", 400);
        b[3] = new Book(4, "Data Structures", "Mark", 650);
        b[4] = new Book(5, "Web Development", "David", 500);

        int highest = 0;

        for (int i = 0; i < b.length; i++) {
            b[i].display();

            if (b[i].price > b[highest].price) {
                highest = i;
            }
        }

        System.out.println("Book with Highest Price:");
        b[highest].display();

        System.out.println("Store Name: " + storeName);
        System.out.println("Total Books: " + bookCount);
    }
}
