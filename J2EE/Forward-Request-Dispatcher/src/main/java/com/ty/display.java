package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/disp")
public class display extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Got Request");
		Object res = req.getAttribute("MyResult");
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>Area: " + res + "</h1>");
		pw.print("</body></html>");
	}
}
