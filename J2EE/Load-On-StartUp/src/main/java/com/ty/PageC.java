package com.ty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageC extends HttpServlet{

	public PageC(){
		System.out.println("I am a constructor of Page A");
	}
	
	@Override
	public void init() throws ServletException{
		System.out.println("Init method of PageC");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget() of PageC is triggered");
	}
}
