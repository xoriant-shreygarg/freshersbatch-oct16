package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShoppingCartServlet")
public class ShoppingCartServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html><head>Username : " + session.getAttribute("uname") + "</head><body>"
				+ "<br><br>Books in Cart<br><table>");
		String[] books = ((String) session.getAttribute("booksInCart")).split(",");
		if (books.length == 1)
			printWriter.println("<br>No books in cart");
		for (int i = 1; i < books.length; i++) {
			if (i == books.length-1)
				printWriter.println("<td>" + books[i] + "." + "</td>");
			else
				printWriter.println("<td>" + books[i] + " , " + "</td>");
		}
		printWriter.println("</table>"
				//+ "<br><form action=\"ControllerServlet?forward=addBooks&flag=0\"><input type=\"submit\" value = \"Back\"></form>"
				+ "<br><form action=\"LogoutServlet\"><input type=\"submit\" value = \"Logout\"></form>"
				+ "</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
