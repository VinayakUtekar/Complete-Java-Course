package com.ty;


import java.sql.*;

public class Update {
	public static void main(String [] args) {
		String url = "jdbc:postgresql://localhost:5432/company";
		String un = "postgres";
		String pw = "root";
		
		try {
			//Step 1
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			
			//Step 2
			Connection con = DriverManager.getConnection(url, un, pw);
			System.out.println("Connection Eastablished");
			
			//Step 3
			Statement stm = con.createStatement();
			System.out.println("Statement Created");
			
			String sql = "UPDATE employee SET emp_name='Omkar' WHERE emp_id=102";
			
			//Step 4
			stm.execute(sql);
			System.out.println("Updated");
			
			//Step 5
			con.close();
			System.out.println("Close Connection");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
