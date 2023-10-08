package br.edu.ifpe.abstracts;

public class Gerente extends Funcionario {

	public Gerente(String nome, Double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() + (getSalario() * 10 / 100));
	}

}
