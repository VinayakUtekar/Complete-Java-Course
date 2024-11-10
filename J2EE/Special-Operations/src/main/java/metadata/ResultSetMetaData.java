package metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root")){
			Statement stm = connection.createStatement();
			String sql = "Select * from employee";
			ResultSet res = stm.executeQuery(sql);
			java.sql.ResultSetMetaData RM =  res.getMetaData();
			System.out.println("No Of Col : " + RM.getColumnCount());
			System.out.println("Name Of Col : " + RM.getColumnName(1));
			System.out.println("Datatype Of Col : " + RM.getColumnType(1));
			System.out.println("Table Name : " + RM.getTableName(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
