package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.soap.InitParam;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/LoginAuthenticationServlet", initParams = {
		@WebInitParam(name = "adminName", value = "shrey"), @WebInitParam(name = "name", value = "value") })

public class LoginAuthenticationServlet extends HttpServlet {

	String adminName = "";

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		adminName = config.getInitParameter("adminName");
		adminName += config.getInitParameter("name");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		if (username.equals(password)) {
			printWriter.println("<html><head><h1>Welcome " + username + "</h1><br><h2>Admin name :" + adminName
					+ "</h2></head></html>");
		} else {
			printWriter.println("<html><head><h1>Incorrect username and password</h1><br><h2>Admin name :" + adminName
					+ "</h2></head></html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
