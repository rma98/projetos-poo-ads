package fila;

import java.util.PriorityQueue;

public class Impressora {
	public static void main(String[] args) {
		PriorityQueue<TarefaDeImpressao> filaDePrioridade = new PriorityQueue<>();

		filaDePrioridade.offer(new TarefaDeImpressao("Documento A", 3));
		filaDePrioridade.offer(new TarefaDeImpressao("Documento B", 1));
		filaDePrioridade.offer(new TarefaDeImpressao("Documento C", 5));

		while (!filaDePrioridade.isEmpty()) {
			TarefaDeImpressao tarefaAtual = filaDePrioridade.poll();
			System.out.println("Imprimindo: " + tarefaAtual);
		}
	}
}
