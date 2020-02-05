package com.bb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello from Get method of XML servlet");
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Hello from GET method using request parameter " + userName);
		//getting session
		HttpSession httpSession = request.getSession();
		//getting context
		ServletContext context = request.getServletContext();
		if (userName != null) {
			httpSession.setAttribute("userName", userName);
			context.setAttribute("userName", userName);
		}
		printWriter.println("Hello from GET method using session parameter " + httpSession.getAttribute("userName"));
		printWriter.println("Hello from GET method using context parameter " + context.getAttribute("userName"));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("userName");
		resp.getWriter().append("Hello from Second servlet " + uname);

	}

}
