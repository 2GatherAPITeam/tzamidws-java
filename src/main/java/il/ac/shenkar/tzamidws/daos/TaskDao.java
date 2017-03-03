package il.ac.shenkar.tzamidws.daos;

import il.ac.shenkar.tzamidws.models.Task;

public class TaskDao {

	private static TaskDao taskDao = new TaskDao();

	public static TaskDao getInstance() {
		return taskDao;
	}

	private TaskDao() {
	}

	public Task getTaskByTaskId(int taskId) {
		return null;
	}

	public void saveNewTask(Task task) {

	}

	public void updateTask(Task task) {

	}

	public void updateStatusForTask(int taskId, String status) {

	}

	public void removeTask(int taskId) {

	}
}
