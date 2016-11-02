package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddBooksServlet")
public class AddBooksServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("uname");
		HttpSession session = request.getSession(true);
		StringBuffer buffer = new StringBuffer();
		String books1[] = request.getParameterValues("book");
		for (int i = 0; i < books1.length; i++) {
			buffer.append("," + books1[i]);
		}
		if (session.getAttribute("booksInCart") == null) {
			session.setAttribute("booksInCart", buffer);
		} else {
			String books = session.getAttribute("booksInCart").toString();
			session.setAttribute("booksInCart", books + buffer);
		}
		String flag = request.getParameter("flag");
		RequestDispatcher rd = null;
		if (flag.equals("0")) {
			rd = request.getRequestDispatcher("books1.html");
		} else if (flag.equals("1")) {
			rd = request.getRequestDispatcher("books2.html");
		} else {
			rd = request.getRequestDispatcher("ShoppingCartServlet");
		}
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
