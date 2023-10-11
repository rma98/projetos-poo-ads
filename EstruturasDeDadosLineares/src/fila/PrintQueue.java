package fila;

public class PrintQueue {
	private Node front;
    private Node rear;

    public void enqueue(PrintJob printJob) {
        Node newNode = new Node(printJob);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public PrintJob dequeue() {
        if (front == null) {
            return null;
        } else {
            PrintJob job = front.getPrintJob();
            front = front.getNext();
            if (front == null) {
                rear = null;
            }
            return job;
        }
    }
}
