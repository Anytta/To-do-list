package webapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import todo.TodoService;

// this class is used for user to login 

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private LoginService userValidationService = new LoginService();
	private TodoService todoValidationService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		boolean userValidation = userValidationService.isUserValid(name, password);

		if (userValidation) {
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/list-todos.do");

		} else {
			request.setAttribute("errorMessage", "Invalid Credencials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
}