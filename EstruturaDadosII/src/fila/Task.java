package fila;

public class Task {
	String description;
    boolean completed;
    int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }
}
