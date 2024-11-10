package execute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");
			String sql2 = "SELECT * FROM employee";
			Statement stm = connection.createStatement();
			System.out.println(stm.executeQuery(sql2));
			ResultSet res = stm.getResultSet();
			System.out.println("Details");
			while(res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2)+ " " + res.getLong(3)+ " " + res.getString(4));
				System.out.println("------------------------------------------------------------");
			}
			connection.close();
			System.out.println("Connection close");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
