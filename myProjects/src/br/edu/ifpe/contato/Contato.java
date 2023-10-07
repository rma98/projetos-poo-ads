package br.edu.ifpe.contato;

import java.util.Objects;

public class Contato {
	private String nome;
	private String telefone;
	
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Contato contato = (Contato) o;
		return Objects.equals(nome, contato.nome) &&
			   Objects.equals(telefone, contato.telefone);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, telefone);
	}
	
}
