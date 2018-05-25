package todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import todo.TodoService;

// this class adds a new task to the to-do list

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {

	private TodoService todoValidationService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String newTodo = request.getParameter("todo");
		String category = request.getParameter("category");

		todoValidationService.addTask(new Todo(newTodo, category));
		response.sendRedirect("/list-todos.do");

	}

}