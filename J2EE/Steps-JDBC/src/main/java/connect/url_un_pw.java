package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class url_un_pw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/company";
		String un = "postgres";
		String pw = "root";
		String driver = "org.postgresql.Driver";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, un, pw);
			System.out.println("Connection is created");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
