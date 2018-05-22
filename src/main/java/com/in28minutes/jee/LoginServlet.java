package com.in28minutes.jee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private LoginService service = new LoginService();

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/Content/Login.jsp").forward(
				request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		boolean isValidUser = service.validateUser(name, password);
		int usertype=service.validateType(name,password);

		if (isValidUser) {
			switch(usertype){
				case 1:
					request.setAttribute("name", "Admin Rexes");
					request.getRequestDispatcher("/WEB-INF/views/Admin/WelcomeAdmin.jsp").forward(request, response);
					break;
				case 2:
					request.setAttribute("name", "Facilitator Jarrhey");
					request.getRequestDispatcher("/WEB-INF/views/Facilitator/WelcomeFacilitator.jsp").forward(request, response);
					break;
				case 3:
					request.setAttribute("name", "Supervisor Cleavon");
					request.getRequestDispatcher("/WEB-INF/views/Supervisor/WelcomeSupervisor.jsp").forward(request, response);
					break;
				case 4:
					request.setAttribute("name", "Trainee Keenan");
					request.getRequestDispatcher("/WEB-INF/views/Trainee/WelcomeTrainee.jsp").forward(request, response);
					break;
				default: break;
			}
			
		} else {
			request.setAttribute("errorMessage", "Invalid Credentials!!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
					request, response);
		}
	}

}