package com.bb.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("---log---");
		System.out.println(request.getContextPath());
		System.out.println(request.getRequestURL());

		String unameParam = request.getParameter("uname");
		String pswd = request.getParameter("pswd");

		Date cur = new Date();

		if (null == unameParam) {
			response.getWriter().append("<html><h1>Served at: " + cur + " </h1></html>").append("Please give unname");
		}

		else {

			response.getWriter().append("<html><h1>Served at: " + cur + " </h1></html>")
					.append(unameParam.toUpperCase()).append("password is " + pswd);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
