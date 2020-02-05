package com.bb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bb.dao.UsersDAO;
import com.bb.entity.Users;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home.do")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet() {
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

		// redirect
		response.sendRedirect("createuser.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username = request.getParameter("uname");
		String email = request.getParameter("email");
		String country = request.getParameter("country");

		Users users = new Users(username, email, country);

		UsersDAO usersDAO = new UsersDAO();
		usersDAO.createUser(users);

		//

		List<Users> userlist = usersDAO.findAll();

		request.setAttribute("userlist", userlist);

		// sendredirect : always creates new req and resp objects
		// response.sendRedirect("home.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
		// persist this into DB
	}

}
