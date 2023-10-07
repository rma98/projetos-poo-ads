package br.edu.ifpe.data;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Pessoa pessoa = new Pessoa();
		
		// pessoa.lerDadosDoTeclado();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o ano de nascimento (no formato yyyy-MM-dd): ");
		String anoNascimento = scanner.nextLine();
		System.out.println("Digite a altura da pessoa: ");
		Double altura = scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		
		Pessoa pessoa = new Pessoa(nome, anoNascimento, altura);
		UtilPessoa p1 = new UtilPessoa();
		
		p1.imprimirDados(pessoa);
		int idade = p1.calcularIdade(pessoa);
		System.out.println("Idade: " + idade + " anos.");
	}
}
