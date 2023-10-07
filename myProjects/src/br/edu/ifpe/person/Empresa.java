package br.edu.ifpe.person;

public class Empresa {
	private String nome;
	private String cnpj;
	private Departamento departamento;
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}
	
	public Empresa(String nome, String cnpj, Departamento departamento) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
}
