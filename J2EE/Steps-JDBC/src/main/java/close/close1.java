package close;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class close1 {

	public static void main(String [] args) {
		String url = "jdbc:postgresql://localhost:5432/company";
		String un = "postgres";
		String pw = "root";
		Connection con = null;
		
		try {
			//Step 1
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			
			//Step 2
			con = DriverManager.getConnection(url, un, pw);
			System.out.println("Connection Eastablished");
			
			//Step 3
			Statement stm = con.createStatement();
			System.out.println("Statement Created");
			
			String sql = "INSERT INTO employee VALUES(106, 'Ram', 9906734896, 'Germany')";
			
			//Step 4
			stm.execute(sql);
			System.out.println("Saved");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				//Step 5
				try {
					con.close();
					System.out.println("Close Connection");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
