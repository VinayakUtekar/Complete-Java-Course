package Special_Procd;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Stored_Procedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/college?user=postgres&password=root");){
			CallableStatement cstm = connection.prepareCall("call student_insert(?,?,?,?,?,?)");
			cstm.setInt(1, 102);
			cstm.setString(2, "sham");
			cstm.setString(3, "sham@gmail.com");
			cstm.setLong(4, 78956436);
			cstm.setString(5, "Thane");
			cstm.setString(6, "AB+");
			cstm.execute();
			System.out.println("Data is Inserted");
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
