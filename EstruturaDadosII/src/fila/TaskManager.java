package fila;

public class TaskManager {
	DoublyLinkedNode head;

    public void addTask(String description, int priority) {
        Task newTask = new Task(description, priority);
        DoublyLinkedNode newNode = new DoublyLinkedNode(newTask);

        if (head == null) {
            head = newNode;
        } else {
            DoublyLinkedNode current = head;
            while (current.next != null && current.task.priority >= priority) {
                current = current.next;
            }
            newNode.prev = current;
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
    }

    public void completeTask(String description) {
        DoublyLinkedNode current = head;
        while (current != null) {
            if (current.task.description.equals(description)) {
                current.task.completed = true;
                return;
            }
            current = current.next;
        }
    }

    public void updateTaskDescription(String oldDescription, String newDescription) {
        DoublyLinkedNode current = head;
        while (current != null) {
            if (current.task.description.equals(oldDescription)) {
                current.task.description = newDescription;
                return;
            }
            current = current.next;
        }
    }

    public void removeTask(String description) {
        DoublyLinkedNode current = head;
        while (current != null) {
            if (current.task.description.equals(description)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    public void displayTasks() {
        DoublyLinkedNode current = head;
        while (current != null) {
            System.out.println("Description: " + current.task.description +
                               ", Priority: " + current.task.priority +
                               ", Completed: " + current.task.completed);
            current = current.next;
        }
    }
}
