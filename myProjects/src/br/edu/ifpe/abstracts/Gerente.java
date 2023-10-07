package br.edu.ifpe.abstracts;

public class Gerente extends Funcionario {

	public Gerente(String nome, Double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double aumentarSalario() {
		Double salario = getSalario();
		Double aumento = salario * 15 / 100;
		Double novoSalario = salario + aumento;
		return novoSalario;
	}

}
