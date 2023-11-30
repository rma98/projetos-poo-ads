package br.com.ada.designpartten.strategy.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.strategy.Funcionario;

public class CalculadorReajusteAnualSalarioEstagio implements CalculadorReajusteAnualSalario {

	@Override
	public void calcularReajusteAnual(Funcionario funcionario) {
		BigDecimal salario = funcionario.getSalario();
		funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
	}

}