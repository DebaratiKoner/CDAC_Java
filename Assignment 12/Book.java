package exam;

public class Book {
	int bookId;
	String bookName;
	String author;
	float price;
	int quantity;
	Book(){
		
	}
	Book(int bookId, String bookName, String author, float price, int quantity) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public float getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	

}
