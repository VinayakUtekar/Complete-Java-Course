package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String name = req.getParameter("Uname");
		String password = req.getParameter("Password");
		
		System.out.println(name + " Welcome TO The Application");
		
		PrintWriter pw = res.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>User Deatils</h1>");
		pw.print("<h2>Name: " + name + "Welcome To App</h2>");
		pw.print("</body></html>");
	}
}
