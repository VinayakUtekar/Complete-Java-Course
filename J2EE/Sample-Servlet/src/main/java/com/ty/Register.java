package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("user-name");
		String email=req.getParameter("user-email");
		String phone=req.getParameter("user-phone");
		System.out.println("----User deatils----");
		System.out.println("Name :"+name +" "+"Email :"+email+ " "+ "Phone :"+phone);
	PrintWriter pw=res.getWriter();
	pw.print("<html> <body>");
	pw.print("<h1> User Details</h1>");
	pw.print("<h2>name :"+name+"</h2>");
	pw.print("<h2>email :"+email+"</h2>");
	pw.print("<h2>phone :"+phone+"</h2>");
	pw.print("</body> </html>");
	}

}