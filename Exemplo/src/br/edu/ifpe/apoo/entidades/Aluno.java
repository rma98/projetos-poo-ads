package br.edu.ifpe.apoo.entidades;

import java.io.Serializable;

public class Aluno implements Serializable, Cloneable {

	private long id;
	private String nome;
	private String cpf;
	private String email;
	
	private Aluno(long id, String nome, String cpf, String email) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static class AlunoBuilder {
		private long id;
		private String nome;
		private String cpf;
		private String email;
		
		public AlunoBuilder id(long id) {
			this.id = id;
			return this;
		}
		public AlunoBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		public AlunoBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		public AlunoBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public Aluno build() {
			return new Aluno(id, nome, cpf, email);
		}
		
	}
	
	@Override
    public Aluno clone() {
        return new AlunoBuilder()
            .id(this.id)
            .nome(this.nome)
            .cpf(this.cpf)
            .email(this.email)
            .build();
    }
	
}
