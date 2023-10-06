package br.edu.ifpe.nota;

public class Main {

	public static void main(String[] args) {
		Nota nota = new Nota();
		
		nota.lerNome();
		nota.lerNotas();
		nota.calcularMedia();
		nota.mostrarDetalhesAluno();
	}

}
