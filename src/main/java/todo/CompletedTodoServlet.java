package todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import todo.TodoService;

// this class shows the tasks on the completed-to-do list

@WebServlet(urlPatterns = "/completed-todos.do")
public class CompletedTodoServlet extends HttpServlet {

	private TodoService todoValidationService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setAttribute("tasks", todoValidationService.retrieveCompletedTasks());
		request.getRequestDispatcher("/WEB-INF/views/completed-todos.jsp").forward(request, response);

	}

}