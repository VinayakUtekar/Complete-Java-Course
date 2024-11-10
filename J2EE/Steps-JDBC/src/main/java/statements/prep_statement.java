package statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class prep_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");
			String sql = "INSERT INTO employee VALUES(?,?,?,?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, 103);
			pstm.setString(2, "Omkar");
			pstm.setLong(3, 98564423);
			pstm.setString(4, "USA");
			pstm.execute();
			System.out.println("Data inserted");
			con.close();
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
