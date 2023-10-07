package br.edu.ifpe.person;

import br.edu.ifpe.person.Pessoa;

public class Funcionario extends Pessoa {
	private String cargo;
	private Double salario;
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario(String nome, int idade, String genero, String cargo, Double salario) {
		super(nome, idade, genero);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
