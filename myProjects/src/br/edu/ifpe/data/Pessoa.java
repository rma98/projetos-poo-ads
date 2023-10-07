package br.edu.ifpe.data;

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
