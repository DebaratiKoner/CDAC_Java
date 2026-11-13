package exam;
import java.util.*;
public class BookMain {
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		BookDAO dao =new BookDAO();
		int ch;
		do {
			System.out.println("1.Add Book");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Display Book");
			System.out.println("5.Search Book by ID");
			System.out.println("0.Exit");
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			switch(ch) {
				case 1:{
					System.out.println("Enter book id");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter book name");
					String name=sc.nextLine();
					System.out.println("Enter author");
					String author=sc.nextLine();
					System.out.println("Enter book price");
					float price=sc.nextFloat();
					System.out.println("Enter book quantity");
					int quantity=sc.nextInt();
					Book b=new Book(id,name,author,price,quantity);
					dao.insertBook(b);
					break;
				}
				case 2:{
					System.out.println("Enter book id");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter book name");
					String name=sc.nextLine();
					System.out.println("Enter author");
					String author=sc.nextLine();
					System.out.println("Enter book price");
					float price=sc.nextFloat();
					System.out.println("Enter book quantity");
					int quantity=sc.nextInt();
					Book b=new Book(id,name,author,price,quantity);
					dao.updateBook(b);
					break;
				}
				case 3:{
					System.out.println("Enter book id");
					int id=sc.nextInt();
					dao.deleteBook(id);
					break;
				}
				case 4:{
					dao.displayAllBooks();
					break;
				}
				case 5:{
					System.out.println("Enter book id");
					int id=sc.nextInt();
					dao.searchBook(id);
					break;
				}
				case 0:{
					System.out.println("Exit");
					break;
				}
				default:{
					System.out.println("invalid choice");
				}
			}
			
		}while(ch!=0);
		sc.close();
	}

}
