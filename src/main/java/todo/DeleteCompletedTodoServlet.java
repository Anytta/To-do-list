package todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import todo.TodoService;

//this class deletes the task from completed-to-do list

@WebServlet(urlPatterns = "/completed-delete-todo.do")
public class DeleteCompletedTodoServlet extends HttpServlet {
	
	private TodoService todoValidationService =new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		todoValidationService.deleteCompletedTask(new Todo(request.getParameter("todo"), request.getParameter("category")));
		response.sendRedirect("/completed-todos.do");
	}

}