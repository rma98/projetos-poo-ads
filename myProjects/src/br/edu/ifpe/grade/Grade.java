package br.edu.ifpe.grade;

import java.util.Scanner;

public class Grade<T> {
	private String nome;
	private T nota01;
	private T nota02;
	private Class<T> type;

	public Grade(Class<T> type) {
		this.type = type;
	}

	public Grade(String nome,T nota01, T nota02, Class<T> type) {
		this.nome = nome;
		this.nota01 = nota01;
		this.nota02 = nota02;
		this.type = type;
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
		// Aqui você pode fazer um tratamento adequado para ler a nota do usuário
		// e converter para o tipo genérico T, dependendo do tipo real de T.
		// Por simplicidade, vamos assumir que T é Double.
		if (type == Double.class) {
			Double primeiraNota = scanner.nextDouble();
			setNota01((T) primeiraNota);
		} else if (type == Integer.class) {
			Integer primeiraNota = scanner.nextInt();
			setNota01((T) primeiraNota);
		}

		System.out.println("Digite a segunda nota: ");
		if (type == Double.class) {
			Double segundaNota = scanner.nextDouble();
			setNota02((T) segundaNota);
		} else if (type == Integer.class) {
			Integer segundaNota = scanner.nextInt();
			setNota02((T) segundaNota);
		}
		scanner.close();
	}

	public void calcularMedia() {
		// Supondo que T seja Double ou Integer, você pode realizar a média da seguinte forma:
		if (type == Double.class) {
			Double media = ((Double) getNota01() + (Double) getNota02()) / 2;

			if (media >= 7) {
				System.out.println("Aprovado");
			} else if (media >= 4) {
				System.out.println("Em recuperação");
			} else {
				System.out.println("Reprovado");
			}
		} else if (type == Integer.class) {
			Integer media = ((Integer) getNota01() + (Integer) getNota02()) / 2;
			if (media >= 7) {
				System.out.println("Aprovado");
			} else if (media >= 4) {
				System.out.println("Em recuperação");
			} else {
				System.out.println("Reprovado");
			}
		}
	}
	
	public void mostrarDetalhesAluno () {
		System.out.println("Nome do Aluno: " + getNome());
		System.out.println("Nota 1: " + getNota01());
		System.out.println("Nota 2: " + getNota02());
		
		if (type == Double.class) {
			Double media = ((Double) getNota01() + (Double) getNota02()) / 2;
			System.out.println("Média: " + media);
		} else if (type == Integer.class) {
			Integer media = ((Integer) getNota01() + (Integer) getNota02()) / 2;
			System.out.println("Média: " + media);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
