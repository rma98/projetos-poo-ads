package br.edu.ifpe.abstracts;

public class Programador extends Funcionario {

	public Programador(String nome, Double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double aumentarSalario() {
		Double salario = getSalario();
		Double aumento = salario * 10 / 100;
		Double novoSalario = salario + aumento;
		return novoSalario;
	}

}
