package br.edu.ifpe.abstracts;

public class Main {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Maria", 20000.0);
		
		Double salarioAtual;
		Double novoSalario;
		
		salarioAtual = gerente.getSalario();
		System.out.println("Gerente: " + gerente.getNome());
		System.out.println("Salário: " + salarioAtual);
		novoSalario = gerente.aumentarSalario();
		System.out.println("Salário após aumento de 15%: " + novoSalario);
		
		Programador programador = new Programador("Marcos", 10000.0);
		
		salarioAtual = programador.getSalario();
		System.out.println("Programador: " + programador.getNome());
		System.out.println("Salário: " + salarioAtual);
		novoSalario = programador.aumentarSalario();
		System.out.println("Salário após aumento de 10%: " + novoSalario);
	}

}
