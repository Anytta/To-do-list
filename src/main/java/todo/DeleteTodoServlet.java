package todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.TodoService;

//this class deletes the task from to-do list

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {

	private TodoService todoValidationService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		todoValidationService.deleteTask(new Todo(request.getParameter("todo"), request.getParameter("category")));
		response.sendRedirect("/list-todos.do");
	}

}