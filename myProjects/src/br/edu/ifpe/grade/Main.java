package br.edu.ifpe.grade;

public class Main {

	public static void main(String[] args) {
		Grade<Double> grade = new Grade<Double>(Double.class);
		
		grade.lerNome();
		grade.lerNotas();
		grade.calcularMedia();
		grade.mostrarDetalhesAluno();
	}

}
