package br.edu.ifpe.listagenerica;

public class Main {

	public static void main(String[] args) {
		ListaGenerica<String> lista = new ListaGenerica<>();
		
		try {
			lista.insert(0, "A");
			lista.insert(1, "B");
			lista.insert(1, "C");
			
			System.out.println("Conteúdo da Lista utilizando vetores\n");
			
			System.out.println("Tamanho da lista: " + lista.size());
			System.out.println();
			System.out.println("Elemento na posição 1: " + lista.get(1));
			
		} catch (ListaVaziaException e) {
			System.out.println("Exceção: " + e.getMessage());
		} catch (PosicaoInvalidaException e) {
			System.out.println("Exceção: " + e.getMessage());
		}
	}

}
