package br.edu.ifpe.grade;

import java.util.Scanner;

public class Grade<T extends Comparable<T>> {
	private String nome;
	private T nota01;
	private T nota02;
	
	public Grade() {
		// TODO Auto-generated constructor stub
	}
	
	public Grade(String nome,T nota01, T nota02) {
		this.nome = nome;
		this.nota01 = nota01;
		this.nota02 = nota02;
	}
	
	public void lerNotas() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		// Aqui você pode fazer um tratamento adequado para ler a nota do usuário
		// e converter para o tipo genérico T, dependendo do tipo real de T.
		// Por simplicidade, vamos assumir que T é Double.
		Double primeiraNota = scanner.nextDouble();
		setNota01((T) primeiraNota);
		
		System.out.println("Digite a segunda nota: ");
		Double segundaNota = scanner.nextDouble();
		setNota01((T) segundaNota);
		
		scanner.close();
	}
	
	public void calcularMedia() {
		// Supondo que T seja Double, você pode realizar a média da seguinte forma:
		Double media = (Double) getNota01() + (Double) getNota02() / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 4) {
			System.out.println("Em recuperação");
		} else {
			System.out.println("Reprovado");
		}
	}

	public T getNota01() {
		return nota01;
	}

	public void setNota01(T nota01) {
		this.nota01 = nota01;
	}

	public T getNota02() {
		return nota02;
	}

	public void setNota02(T nota02) {
		this.nota02 = nota02;
	}
	
}
