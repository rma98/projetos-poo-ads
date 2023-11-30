package br.com.ada.designpartten.strategy.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.strategy.Funcionario;
import br.com.ada.designpartten.strategy.TipoContratacaoEnum;

public class ReajusteAnualSalarioComStrategy {

	public void calcularReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {
		calculador.calcularReajusteAnual(funcionario);
	}
}
