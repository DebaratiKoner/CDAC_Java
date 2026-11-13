package exam;
import java.sql.*;
public class DBConnection {
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/dbda",
				"root",
				"mysql"
				);
				return con;
	}

}
