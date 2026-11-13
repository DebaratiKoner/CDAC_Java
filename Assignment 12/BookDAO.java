package exam;
import java.sql.*;
public class BookDAO {
	//insert book
	public void insertBook(Book b) throws Exception{
		Connection con=DBConnection.getConnection();
		String q="insert into book values(?,?,?,?,?)";
		PreparedStatement pmt=con.prepareStatement(q);
		pmt.setInt(1,b.getBookId());
		pmt.setString(2, b.getBookName());
		pmt.setString(3, b.getAuthor());
		pmt.setFloat(4, b.getPrice());
		pmt.setInt(5, b.getQuantity());
		int n=pmt.executeUpdate();
		if(n>0) {
			System.out.println("Book inserted successfully");
		}
		pmt.close();
		con.close();
		
	}
	//update book
	public void updateBook(Book b) throws Exception{
		Connection con=DBConnection.getConnection();
		String q="update book set book_name=?,author=?,price=?,quantity=? where book_id=?";
		PreparedStatement pmt=con.prepareStatement(q);
		pmt.setString(1, b.getBookName());
		pmt.setString(2, b.getAuthor());
		pmt.setFloat(3, b.getPrice());
		pmt.setInt(4, b.getQuantity());
		pmt.setInt(5,b.getBookId());
		int n=pmt.executeUpdate();
		if(n>0) {
			System.out.println("Book updated successfully");
		}
		else {
			System.out.println("Book not found");
		}
		pmt.close();
		con.close();
		
	}
	//delete book
	public void deleteBook(int id) throws Exception{
		Connection con=DBConnection.getConnection();
		String q="delete from book where book_id=?";
		PreparedStatement pmt=con.prepareStatement(q);
		pmt.setInt(1,id);
		int n=pmt.executeUpdate();
		if(n>0) {
			System.out.println("Book deleted successfully");
		}
		else {
			System.out.println("Book not found");
		}
		pmt.close();
		con.close();
		
	}
	//display all books
	public void displayAllBooks() throws Exception{
		Connection con=DBConnection.getConnection();
		String q="select * from book";
		PreparedStatement pmt=con.prepareStatement(q);
		ResultSet rs=pmt.executeQuery();
		System.out.println("ID \t NAME \t AUTHOR \t PRICE \t QUANTITY");
		while(rs.next()) {
			System.out.println(
					rs.getInt(1)+"\t"+
					rs.getString(2)+"\t"+
					rs.getString(3)+"\t"+
					rs.getFloat(4)+"\t"+
					rs.getInt(5)
					);
		}
		rs.close();
		pmt.close();
		con.close();
		
	}
	//search book by id
	public void searchBook(int id) throws Exception{
		Connection con=DBConnection.getConnection();
		String q="select * from book where book_id=?";
		PreparedStatement pmt=con.prepareStatement(q);
		pmt.setInt(1,id);
		ResultSet rs=pmt.executeQuery();
		if(rs.next()) {
			System.out.println("Book Id:"+rs.getInt(1));
			System.out.println("Book Name:"+rs.getString(2));
			System.out.println("Author:"+rs.getString(3));
			System.out.println("Price:"+rs.getFloat(4));
			System.out.println("Quantity:"+rs.getInt(5));
		}
		else {
			System.out.println("Book not found");
		}
		rs.close();
		pmt.close();
		con.close();
		
	}
	

}
