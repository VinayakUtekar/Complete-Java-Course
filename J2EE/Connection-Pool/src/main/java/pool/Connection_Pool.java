package pool;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Pool {
	
	private static String url = "jdbc:postgresql://localhost:5432/company";
	private static String un = "postgres";
	private static String pw = "root";
	private static String driver = "org.postgresql.Driver";
	
	private static List<Connection> ConnectionPool = new ArrayList<Connection>();
	private static final int pool = 5;
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
			for(int i=0; i<pool; i++) {
				Connection connection = CreateConnection();
				ConnectionPool.add(connection);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static Connection CreateConnection(){
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, un, pw);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static Connection GiveConnection() {
		if(!ConnectionPool.isEmpty()) {
			return ConnectionPool.remove(0);
		}else {
			Connection connection = CreateConnection();
			return connection;
		}
	}
	
	public static void SubmitConnection(Connection connection) {
		if(ConnectionPool.size() < pool) {
			ConnectionPool.add(connection);
		}
		else {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
