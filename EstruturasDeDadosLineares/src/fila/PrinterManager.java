package fila;

public class PrinterManager {
	public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();

        printQueue.enqueue(new PrintJob("\nDocumento 1"));
        printQueue.enqueue(new PrintJob("\nDocumento 2"));
        printQueue.enqueue(new PrintJob("\nDocumento 3"));

        while (true) {
            PrintJob job = printQueue.dequeue();
            if (job == null) {
                System.out.println("\nSem mais prints.");
                break;
            }
            System.out.println("\nPrintando: " + job.getContent());
        }
    }
}
