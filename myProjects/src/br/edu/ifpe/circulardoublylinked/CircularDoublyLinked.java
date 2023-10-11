package br.edu.ifpe.circulardoublylinked;

public class CircularDoublyLinked<T> {
	public Node<T> head;
	public int size;
	
	// Construtor para criar uma lista vazia
	public CircularDoublyLinked() {
		head = null;
		size = 0;
		if (head != null) {
			head.next = head;
			head.prev = head;
		}
	}
	
	public void insert(int position, T element) throws PosicaoInvalidaException {
		if (position < 0 || position > size) {
			throw new PosicaoInvalidaException("Posição inválida");
		}
		Node<T> newNode = new Node<>(element);
		if (size == 0) {
			head = newNode;
			newNode.prev = newNode;
			newNode.next = newNode;
		} else if (position == 0) {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
			head = newNode;
		} else {
			Node<T> current = head;
			for (int i = 0; i< position - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			newNode.prev = current;
			current.next.prev = newNode;
			current.next = newNode;
		}
		size++;
	}
	
	public void remover(int position) throws ListaVaziaException, PosicaoInvalidaException {
		if (size == 0) {
			throw new ListaVaziaException("A lista está vazia");
		}
		if (position < 0 || position >= size) {
			throw new PosicaoInvalidaException("Posição inválida");
		}
		if (size == 1) {
			head = null;
		} else if (position == 0) {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		} else {
			Node<T> current = head;
			for (int i = 0; i < position; i++) {
				current = current.next;
			}
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}
		size++;
	}
	
	public void printList() {
		if (size == 0) {
			System.out.println("A lista está vazia");
			return;
		}
		
		Node<T> current = head;
		for (int i = 0; i < size; i++) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public Node<T> getHead() {
		return head;
	}
}
