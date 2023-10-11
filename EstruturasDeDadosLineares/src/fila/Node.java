package fila;

public class Node {
	private PrintJob printJob;
    private Node next;

    public Node(PrintJob printJob) {
        this.printJob = printJob;
    }

    public PrintJob getPrintJob() {
        return printJob;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
