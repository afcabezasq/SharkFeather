package com.revature.delegates;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewDelegate {

	public void returnView(HttpServletRequest request, 
			HttpServletResponse response) throws IOException, ServletException {
		String path = request.getServletPath();
		switch(path) {
		case "/login":
			request.getRequestDispatcher("/static/Views/LoginP1.html").forward(request, response);
			break;
		case "/profile":
			request.getRequestDispatcher("/static/Views/Profile.html").forward(request, response);
			break;
		case "/manager":
			request.getRequestDispatcher("/static/Views/Manager.html").forward(request, response);
			break;
		case "/home":
			request.getRequestDispatcher("/static/Views/Manager.html").forward(request, response);
			break;
		default:
			response.sendError(404, "static resource not found");
		}
	}

}
