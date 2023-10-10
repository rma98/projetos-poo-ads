package br.edu.ifpe.test;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private List<Contrato> contratos;
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.contratos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
	
}
