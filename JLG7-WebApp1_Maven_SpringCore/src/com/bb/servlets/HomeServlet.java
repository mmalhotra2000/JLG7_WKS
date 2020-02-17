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

	UsersDAO usersDAO = UsersDAO.getInstance();// manual dep injection

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

		String id = request.getParameter("id");
		// System.out.println("id is ::" + request.getParameter("id"));
		// redirect

		if (id == null) {
			response.sendRedirect("createuser.jsp");
		} else {
			Users users = usersDAO.findById(Long.valueOf(id));

			request.setAttribute("users", users);

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("createuser.jsp");
			requestDispatcher.forward(request, response);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = request.getParameter("id");

		String username = request.getParameter("uname");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		Users users = null;
		if (id == null) {
			users = new Users(username, email, country);
		} else {
			users = new Users(Long.parseLong(id), username, email, country);
		}

		usersDAO.createOrUpdate(users);

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
