package todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import todo.TodoService;

// this class moves the item from "to-do-list to the completed-to-do-list"

@WebServlet(urlPatterns = "/add-completed-todos.do")
public class AddCompleteTodoServlet extends HttpServlet {

	private TodoService todoValidationService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String newTodo = request.getParameter("todo");
		String category = request.getParameter("category");

		todoValidationService.addTaskAsComplete(new Todo(newTodo, category));
		todoValidationService.deleteTask(new Todo(request.getParameter("todo"), request.getParameter("category")));
		response.sendRedirect("list-todos.do");

	}

}