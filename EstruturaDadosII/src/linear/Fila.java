package linear;

public class Fila {
	private int[] elementos;
	private int tamanho;
	private int capacidade;
	private int inicio;
	private int fim;
	
	public Fila(int capacidade) {
		this.capacidade = capacidade;
		this.elementos = new int[capacidade];
		this.tamanho = 0;
		this.inicio = 0;
		this.fim = 0;
	}
	
	public void enqueue(int elemento) throws ExceptionFilaCheia {
		if (tamanho < capacidade) {
			elementos[fim] = elemento;
			fim = (fim+ 1) % capacidade;
			tamanho++;
		} else {
			throw new ExceptionFilaCheia();
		}
	}
	
	public int dequeue() throws ExceptionFilaVazia{
		if (tamanho > 0) {
			int elemento = elementos[inicio];
			inicio = (inicio + 1) % capacidade;
			tamanho++;
			return elemento;
		} else {
			throw new ExceptionFilaVazia();
		}
	}
	
	public int size() {
		return tamanho;
	}
	
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public int getElemento(int index) {
		if (index >= 0 && index < tamanho) {
			return elementos[(inicio + index) % capacidade];
		} else {
			throw new IndexOutOfBoundsException("Índice inválido");
		}
	}
}
