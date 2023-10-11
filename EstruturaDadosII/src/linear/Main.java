package linear;

public class Main {

	public static void main(String[] args) {
		try {
			Pilha pilha = new Pilha(5);
			pilha.push(10);
			pilha.push(20);
			pilha.push(30);

			System.out.println("\nTamanho da Pilha: " + pilha.size());
			System.out.println("Elemento no topo da Pilha (peek): " + pilha.peek());
			System.out.println("Elemento removido da Pilha: " + pilha.pop());
			System.out.println("Tamanho da Pilha após remoção: " + pilha.size());
			System.out.println("Capacidade da Pilha: " + pilha.getCapacidade());
			System.out.println("Elemento na posição 1 da Pilha: " + pilha.getElemento(1));

			Fila fila = new Fila(5);
			fila.enqueue(5);
			fila.enqueue(15);
			fila.enqueue(25);

			System.out.println("\nTamanho da Fila: " + fila.size());
			System.out.println("Elemento removido da Fila: " + fila.dequeue());
			System.out.println("Tamanho da fila após remoção: " + fila.size());
			System.out.println("Capacidade da Fila: " + fila.getCapacidade());
			System.out.println("Elemento na posição 0 da Fila: " + fila.getElemento(0));

			ListaCircular lista = new ListaCircular();
			lista.inserir(3);
			lista.inserir(6);
			lista.inserir(9);

			System.out.println("\nInserções na Lista Circular: 3, 6, 9");

			lista.remover();
			System.out.println("Remoção na Lista Circular");

			System.out.println("Valor do início da Lista Circular: " + lista.getInicioValor());


			lista.inserirNoMeio(5, 1); 

			System.out.println("\nInserção no meio da Lista Circular: 5 após o primeiro elemento");
			System.out.println("Valor do início da Lista Circular: " + lista.getInicioValor());

			lista.inserir(12);

			System.out.println("Inserção no fim da Lista Circular: 12");
			System.out.println("Valor do início da Lista Circular: " + lista.getInicioValor());

		} catch (ExceptionPilhaCheia e) {
			System.out.println("Erro: Pilha está cheia");
		} catch (ExceptionPilhaVazia e) {
			System.out.println("Erro: Pilha está vazia");
		} catch (ExceptionFilaCheia e) {
			System.out.println("Erro: Fila está cheia");
		} catch (ExceptionFilaVazia e) {
			System.out.println("Erro: Fila está vazia");
		} catch (ExceptionListaCircularVazia e) {
			System.out.println("Erro: Lista circular está vazia");
		}
		
		System.out.println("\nEQUIPE: "
				+ "\nROBSON ALBUQUERQUE"
				+ "\nHIANY SILVA"
				+ "\nCAROLAINE SILVA");
	}
}