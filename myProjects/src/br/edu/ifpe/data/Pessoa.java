package br.edu.ifpe.data;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private String anoNascimento;
	private Double altura;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String anoNascimento, Double altura) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
	}
	
	public void lerDadosDoTeclado() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		this.nome = scanner.nextLine();
		
		System.out.println("Digite o ano de Nascimento (no formato yyyy-MM-dd): ");
		this.anoNascimento = scanner.nextLine();
		
		System.out.println("Digite a altura da pessoa: ");
		this.altura = scanner.nextDouble();
		
		scanner.nextLine(); // Consumir a nova linha deixada pelo nextDouble()
		
		scanner.close();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
