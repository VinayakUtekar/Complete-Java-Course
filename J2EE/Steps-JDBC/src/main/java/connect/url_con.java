package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class url_con {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/company?user=postgres&password=root";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url);
			System.out.println("Connnection is created");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
