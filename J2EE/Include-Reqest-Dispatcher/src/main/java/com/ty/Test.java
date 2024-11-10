package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class Test extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String us = req.getParameter("un");
		String pwd = req.getParameter("pw");
		if (us.equals("admin") && pwd.equals("root")) {
			PrintWriter pw = resp.getWriter();
			pw.print("<html><body>");
			pw.print("<h1>Login is Successful & Welcome to App</h1>");
			pw.print("</body></html>");
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("<html><body>");
			pw.print("<h1>UserName & Password Incorrect</h1>");
			pw.print("</body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
		}
	}
}
