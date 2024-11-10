package driverpack;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.postgresql.Driver;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driv = new Driver();
		try {
			DriverManager.registerDriver(driv);
			System.out.println("Driver is register to DriverManager");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
