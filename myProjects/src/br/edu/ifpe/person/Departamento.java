package br.edu.ifpe.person;

import java.util.List;
import java.util.ArrayList;

public class Departamento {
	private String nome;
	private List<Funcionario> funcionarios;
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}
	
	public Departamento(String nome) {
		this.nome = nome;
		this.funcionarios = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
