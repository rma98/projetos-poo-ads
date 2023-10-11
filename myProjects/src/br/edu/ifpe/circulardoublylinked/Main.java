package br.edu.ifpe.circulardoublylinked;

public class Main {

	public static void main(String[] args) {
		CircularDoublyLinked<Integer> list = new CircularDoublyLinked<>();
		
		try {
			System.out.println("Conteúdo da lista duplamente encadeada circular");
			list.insert(0, 1);
			list.insert(1, 2);
			list.insert(1, 3);
			
			// A lista agora contém [1, 3, 2]
			
			list.remover(1);
			
			// A lista agora contém [1, 2]
			
			// Imprimindo o conteúdo da lista
			Node<Integer> current = list.getHead();
			for (int i = 0; i < list.size; i++) {
				System.out.println(current.data + " ");
				current = current.next;
				if (current == list.getHead()) {
					break; // Adicionando uma condição de parada para evitar repetição
				}
			}
		} catch (ListaVaziaException e) {
			System.out.println("Exceção: " + e.getMessage());
		} catch (PosicaoInvalidaException e) {
			System.out.println("Exceção: " + e.getMessage());
		}
	}

}
