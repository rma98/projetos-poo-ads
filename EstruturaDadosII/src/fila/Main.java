package fila;

public class Main {
	public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Ler livro", 2);
        taskManager.addTask("Enviar e-mail", 1);
        taskManager.addTask("Fazer compras", 3);

        System.out.println("Tarefas pendentes:");
        taskManager.displayTasks();

        System.out.println("\nMarcando tarefa como concluída...");
        taskManager.completeTask("Ler livro");
        taskManager.displayTasks();

        System.out.println("\nAtualizando tarefa...");
        taskManager.updateTaskDescription("Enviar e-mail", "Enviar convite");
        taskManager.displayTasks();

        System.out.println("\nRemovendo tarefa...");
        taskManager.removeTask("Fazer compras");
        taskManager.displayTasks();
    }
}