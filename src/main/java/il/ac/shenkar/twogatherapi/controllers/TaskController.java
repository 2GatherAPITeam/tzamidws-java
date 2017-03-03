package il.ac.shenkar.twogatherapi.controllers;

import il.ac.shenkar.twogatherapi.daos.TaskDao;
import il.ac.shenkar.twogatherapi.models.Task;

public class TaskController {

	private TaskDao taskDao;

	public TaskController() {
		this.taskDao = TaskDao.getInstance();
	}

	public Task getTaskByTaskId(int taskId){
		return taskDao.getTaskByTaskId(taskId);
	}

	public void saveNewTask(Task task){
		taskDao.saveNewTask(task);
	}

	public void updateTask(Task task){
		taskDao.updateTask(task);
	}

	public void updateStatusForTask(int taskId, String status){
		taskDao.updateStatusForTask(taskId, status);
	}

	public void removeTask(int taskId){
		taskDao.removeTask(taskId);
	}
}
