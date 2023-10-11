package br.edu.ifpe.listagenerica;

public class ListaGenerica<T> {
	private int DEFAULT_CAPACITY = 0;
	private Object[] array;
	private int size;
	
	public ListaGenerica() {
		array = new Object[DEFAULT_CAPACITY];
		size = 0;
	}
	
	public void insert(int position, T element) throws ListaVaziaException, PosicaoInvalidaException {
		if (position < 0 || position > size) {
			throw new PosicaoInvalidaException("Posição inválida");
		}
		
		// Deslocar elementos para abrir espaço para o novo elemento
		for (int i = size; i > position; i--) {
			array[i] = array[i - 1];
		}
		
		array[position] = element;
		size++;
	}
	
	public T get(int position) throws ListaVaziaException, PosicaoInvalidaException {
		if (isEmpty()) {
			throw new ListaVaziaException("A lista está vazia");
		}
		if (position < 0 || position >= size) {
			throw new PosicaoInvalidaException("Posição inválida");
		}
		@SuppressWarnings("unchecked")
		T element = (T) array[position];
		return element;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
