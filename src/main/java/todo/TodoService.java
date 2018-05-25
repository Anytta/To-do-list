package todo;

import java.util.ArrayList;
import java.util.List;

// this class creates two Arrays- for tasks on to-do list and for tasks on completed-to-do list
// it also creates basics methods to manipulate on the tasks (todos)

public class TodoService {

	private static List<Todo> tasks = new ArrayList<Todo>();
	private static List<Todo> completedTasksList = new ArrayList<Todo>();
	
	public List<Todo> retrieveTasks(){
		return tasks; 
	}
	
	public List<Todo> retrieveCompletedTasks(){
		return completedTasksList; 
	}

	public void addTask(Todo todo) {
		tasks.add(todo);
	}
	
	public void addTaskAsComplete(Todo todo) {
		completedTasksList.add(todo);
	}
	
	public void deleteTask(Todo todo) {
		tasks.remove(todo);
	}
	
	public void deleteCompletedTask(Todo todo) {
		completedTasksList.remove(todo);
	}
	
	public boolean isEmptyList() {
		
		if (tasks.isEmpty()) return true;
		
		return false;
	}
	
}
