package Function_Opera;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FunctionOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");){
			CallableStatement cstm = connection.prepareCall("Select employee_count_by_name(?)");
			cstm.setString(1, "USA");
			ResultSet res = cstm.executeQuery();
			if(res.next()) {
				System.out.println("No of employee : " + res.getInt(1));
			}
			else {
				System.out.println("No employee");
			}
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
