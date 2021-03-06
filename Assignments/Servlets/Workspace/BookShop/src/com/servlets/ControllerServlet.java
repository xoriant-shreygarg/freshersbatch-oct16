package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String forward = request.getParameter("forward");
		RequestDispatcher rd = null;
		if (forward.equals("login"))
			rd = request.getRequestDispatcher("LoginServlet");
		else if (forward.equals("addBooks"))
			rd = request.getRequestDispatcher("AddBooksServlet");
		else if (forward.equals("shoppingCart"))
			rd = request.getRequestDispatcher("ShoppingCartServlet");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
