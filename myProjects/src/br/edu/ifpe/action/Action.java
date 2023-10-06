package br.edu.ifpe.action;

public class Action {
	private String nome;
	private String dataNascimento;
	private String cpf;	
	
	public Action(String nome, String dataNascimento, String cpf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}
	
	public void wakeup() {
		System.out.println("Acordar");
	}
	
	public void eat() {
		System.out.println("Comer");
	}
	
	public void sleep() {
		System.out.println("Dormir");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
