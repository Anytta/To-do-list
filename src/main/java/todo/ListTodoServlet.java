package todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.TodoService;

// this class shows the list of tasks on to-do list

@WebServlet(urlPatterns = "/list-todos.do")
public class ListTodoServlet extends HttpServlet {

	private TodoService todoValidationService = new TodoService();
	private String TasksSummary = " ";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		if (todoValidationService.isEmptyList()) {
			TasksSummary = " You don't have any tasks yet. Go ahead and add new ones ";
		} else {
			TasksSummary = " Your current tasks are:";

		}
		request.setAttribute("TasksSummary", TasksSummary);
		request.setAttribute("tasks", todoValidationService.retrieveTasks());
		request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
	}

}