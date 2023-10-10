package br.edu.ifpe.test;

import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private String nome;
	private List<Empresa> empresas;
	
	public Contrato(String nome) {
		this.nome = nome;
		this.empresas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
	
}
