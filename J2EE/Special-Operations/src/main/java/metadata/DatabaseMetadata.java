package metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetadata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root")){
			DatabaseMetaData db = connection.getMetaData();
			System.out.println("Driver : " + db.getDriverName());
			System.out.println("Version : " + db.getDriverVersion());
			System.out.println("User : " + db.getUserName());
			System.out.println(db.supportsStoredProcedures());
			System.out.println(db.supportsFullOuterJoins());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
