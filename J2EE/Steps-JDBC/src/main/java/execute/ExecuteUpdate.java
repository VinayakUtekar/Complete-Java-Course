package execute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");
			String sql = "UPDATE employee SET emp_name='Aditya' WHERE emp_id=103";
			String sql1 = "INSERT INTO employee VALUES(105, 'Amey', 89856321545, 'Russia')";
			String sql2 = "SELECT * FROM employee";
			Statement stm = connection.createStatement();
			System.out.println(stm.executeUpdate(sql1));
			System.out.println(stm.executeUpdate(sql));
			int res = stm.executeUpdate(sql2);
			System.out.println("Result");
			
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
