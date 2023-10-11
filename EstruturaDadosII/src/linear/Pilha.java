package linear;

import java.nio.channels.IllegalSelectorException;

public class Pilha {
	private int[] elementos;
	private int tamanho;
	private int capacidade;

	public Pilha(int capacidade) {
		this.capacidade = capacidade;
		this.elementos = new int[capacidade];
		this.tamanho = 0;
	}

	public void push(int elemento) throws ExceptionPilhaCheia {
		if (tamanho < capacidade) {
			elementos[tamanho] = elemento;
			tamanho++;
		} else {
			throw new ExceptionPilhaCheia();
		} 
	}

	public int pop() throws ExceptionPilhaVazia {
		if (tamanho > 0) {
			tamanho--;
			return elementos[tamanho];
		} else {
			throw new ExceptionPilhaVazia();
		}
	}

	public int peek() throws ExceptionPilhaVazia {
		if (tamanho > 0) {
			return elementos[tamanho - 1];
		} else {
			throw new ExceptionPilhaVazia();
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
			return elementos[index];
		} else {
			throw new IndexOutOfBoundsException("Índice inválido");
		}
	}
}
