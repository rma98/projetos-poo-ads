package br.com.ada.designpartten.strategy.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.strategy.Funcionario;
import br.com.ada.designpartten.strategy.TipoContratacaoEnum;

public class TesteAjusteSalaroComStrategy {

	public static void main(String[] args) {
		ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();
		
		Funcionario funcionarioCLT = new Funcionario();
		funcionarioCLT.setNome("Victor");
		funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
		funcionarioCLT.setSalario(new BigDecimal(5000));
		
		Funcionario funcionarioPJ = new Funcionario();
		funcionarioPJ.setNome("Podolski");
		funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
		funcionarioPJ.setSalario(new BigDecimal(10000));
		
		Funcionario funcionarioCooperativa = new Funcionario();
		funcionarioCooperativa.setNome("José");
		funcionarioCooperativa.setTipoContratacao(TipoContratacaoEnum.Cooperativa);
		funcionarioCooperativa.setSalario(new BigDecimal(8000));
		
		Funcionario funcionarioEstagio = new Funcionario();
		funcionarioEstagio.setNome("Osvaldo");
		funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
		funcionarioEstagio.setSalario(new BigDecimal(15000));
		
		// calcular nosso reajuste aqui
		reajusteAnualSalario.calcularReajusteAnual(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
		reajusteAnualSalario.calcularReajusteAnual(funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());
		reajusteAnualSalario.calcularReajusteAnual(funcionarioCooperativa, new CalculadorReajusteAnualSalarioCooperativa());
		reajusteAnualSalario.calcularReajusteAnual(funcionarioEstagio, new CalculadorReajusteAnualSalarioEstagio());
		
		System.out.println(funcionarioCLT);
		System.out.println(funcionarioPJ);
		System.out.println(funcionarioCooperativa);
		System.out.println(funcionarioEstagio);
	}
	
}
