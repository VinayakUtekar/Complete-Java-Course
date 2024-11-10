package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class Register extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		String name = req.getParameter("User_name");
		String email = req.getParameter("User_email");
		String phone = req.getParameter("User_phone");
		
		System.out.println("User Details");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
		
		PrintWriter pw = res.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>User Deatils</h1>");
		pw.print("<h2>Name: " + name + "</h2>");
		pw.print("<h2>Email: " + email + "</h2>");
		pw.print("<h2>Phone: " + phone + "</h2>");
		pw.print("</body></html>");
	}
}
