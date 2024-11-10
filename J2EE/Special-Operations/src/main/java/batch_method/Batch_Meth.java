package batch_method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_Meth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");
			String sql = "UPDATE employee SET emp_id='107' WHERE emp_id=10";
			String sql1 = "INSERT INTO employee VALUES(108, 'Amey', 7286431425, 'Morocoo')";
			String sql2 = "INSERT INTO employee VALUES(109, 'Shubham', 879421354, 'Spain')";
			String sql3 = "INSERT INTO employee VALUES(110, 'Sahil', 897264548, 'Portugal')";
			Statement stm = connection.createStatement();
			stm.addBatch(sql);
			stm.addBatch(sql1);
			stm.addBatch(sql2);
			stm.addBatch(sql3);
			
			int[] res = stm.executeBatch();
			System.out.println("Executed");
			System.out.println("Affected Row");
			for(int i=0; i<res.length; i++) {
				System.out.println(res[i]);
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
					System.out.println("Connection close");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}


}
