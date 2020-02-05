package com.bb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PassigMoreParamServlet
 */
@WebServlet("/passmore")
public class PassigMoreParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PassigMoreParamServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello from POST method of XML servlet");
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		String lastName = request.getParameter("lastName");
		String profession = request.getParameter("profession");
		String countries = request.getParameter("countries");
		String[] cities = request.getParameterValues("cities");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Hello from POST method \n");
		printWriter.println("First Name is \n " + userName);
		printWriter.println("Last Name is \n" + lastName);
		printWriter.println("Profession is \n " + profession);
		printWriter.println("Country is \n " + countries);
		printWriter.println("Cities are \n ");
		for (String s : cities) {
			printWriter.println(s + " ,");
		}

	}

}
