package br.edu.ifpe.abstracts;

public class Programador extends Funcionario {

	public Programador(String nome, Double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() + (getSalario() * 20 / 100));
	}

}
