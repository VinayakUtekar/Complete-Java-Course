package com.ty;


import java.sql.*;

public class Retrieve {
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
			
			String sql = "SELECT * FROM employee";
			
			//Step 4
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				int Emp_Id = rs.getInt(1);
				String name = rs.getString(2);
				long phone = rs.getLong(3);
				String add = rs.getString(4);
				System.out.println(Emp_Id + " " + name + " " + phone + " " + add);
			}
			System.out.println("Fetched");
			
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
