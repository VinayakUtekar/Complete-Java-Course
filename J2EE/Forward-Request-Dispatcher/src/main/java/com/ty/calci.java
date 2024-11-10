package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calci")
public class calci extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rad = req.getParameter("radius");
		double r = Double.parseDouble(rad);
		double res = 3.14 * r * r;
		req.setAttribute("MyResult", res);
		RequestDispatcher rd = req.getRequestDispatcher("disp");
		rd.forward(req, resp);
	}
}
