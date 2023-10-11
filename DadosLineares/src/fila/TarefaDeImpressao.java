package fila;

public class TarefaDeImpressao implements Comparable<TarefaDeImpressao> {
	private String documento;
	private int prioridade;

	public TarefaDeImpressao(String documento, int prioridade) {
		this.documento = documento;
		this.prioridade = prioridade;
	}

	@Override
	public int compareTo(TarefaDeImpressao outraTarefa) {
		return Integer.compare(this.prioridade, outraTarefa.prioridade);
	}

	@Override
	public String toString() {
		return "Documento: " + documento + " (Prioridade: " + prioridade + ")";
	}
}
