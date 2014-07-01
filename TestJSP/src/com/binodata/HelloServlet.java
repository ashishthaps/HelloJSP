package com.binodata;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(name="Hello", urlPatterns={"/hello.do"})
public class HelloServlet extends HttpServlet {

	/*
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("user");
		String message = hello.doHello(name);
		req.setAttribute("message", message);
		req.getRequestDispatcher("Hello.jsp").forward(req, resp);
		
	}

	private Hello hello = new Hello();	

}
