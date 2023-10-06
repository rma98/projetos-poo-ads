package br.edu.ifpe.nota;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Nota {
	private String nome;
	private Double nota01;
	private Double nota02;
	
	public Nota(String nome, Double nota01, Double nota02) {
		this.nome = nome;
		this.nota01 = nota01;
		this.nota02 = nota02;
	}
	
	public void lerNome() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = scanner.nextLine();
		setNome(nome);
	}
	
	public void lerNotas() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		while (!scanner.hasNextDouble()) {
			System.out.println("Entrada inválida. Digite a primeira nota novamente: ");
			scanner.next();
		}
		nota01 = scanner.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		while (!scanner.hasNextDouble()) {
			System.out.println("Entrada inválida. Digite a segunda nota novamente: ");
			scanner.next();
		}
		nota02 = scanner.nextDouble();
		
		scanner.close();
	}
	
	public void calcularMedia() {
		Double media = (nota01 + nota02) / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 4) {
			System.out.println("Em recuperação");
		} else {
			System.out.println("Reprovado");
		}
	}
	
	public void mostrarDetalhesAluno() {
		System.out.println("Nome do aluno: " + getNome());
		System.out.println("Nota 1: " + getNota01());
		System.out.println("Nota 2: " + getNota02());
		
		Double media = (getNota01() + getNota02()) / 2;
		System.err.println("Média: " + media);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota01() {
		return nota01;
	}

	public void setNota01(Double nota01) {
		this.nota01 = nota01;
	}

	public Double getNota02() {
		return nota02;
	}

	public void setNota02(Double nota02) {
		this.nota02 = nota02;
	}
	
}
