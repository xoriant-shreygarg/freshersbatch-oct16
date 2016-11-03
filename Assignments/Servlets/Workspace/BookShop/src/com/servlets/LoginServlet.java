package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
		if (username.equals(password)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("uname", username);
			session.setAttribute("password", password);
			rd = request.getRequestDispatcher("books1.html");
		} else {
			rd = request.getRequestDispatcher("login.hmtl");
		}
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
