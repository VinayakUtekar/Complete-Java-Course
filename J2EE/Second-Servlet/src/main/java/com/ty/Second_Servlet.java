package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Second_Servlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		System.out.println("Hi i am called");
		PrintWriter pw = res.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>Hi This Is First Servlet Getting Triggered</h1>");
		pw.print("</body></html>");
	}
	
	

}
