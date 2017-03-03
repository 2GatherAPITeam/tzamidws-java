package il.ac.shenkar.twogatherapi.models;

import il.ac.shenkar.twogatherapi.enums.TaskStatus;

public class Task {

	private int id;
	private String name;
	private String taskDescription;
	private TaskStatus taskStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	@Override public String toString() {
		return "Task{" + "id=" + id + ", name='" + name + '\'' + ", taskDescription='" + taskDescription + '\'' + ", taskStatus=" + taskStatus + '}';
	}
}
