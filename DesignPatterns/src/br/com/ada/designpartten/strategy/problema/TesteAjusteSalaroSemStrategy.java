package br.com.ada.designpartten.strategy.problema;

import java.math.BigDecimal;

import br.com.ada.designpartten.strategy.Funcionario;
import br.com.ada.designpartten.strategy.TipoContratacaoEnum;

public class TesteAjusteSalaroSemStrategy {

	public static void main(String[] args) {
		ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();
		
		Funcionario funcionarioCLT = new Funcionario();
		funcionarioCLT.setNome("Victor");
		funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
		funcionarioCLT.setSalario(new BigDecimal(5000));
		
		Funcionario funcionarioPJ = new Funcionario();
		funcionarioPJ.setNome("Podolski");
		funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
		funcionarioPJ.setSalario(new BigDecimal(10000));
		
		Funcionario funcionarioEstagio = new Funcionario();
		funcionarioEstagio.setNome("Osvaldo");
		funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
		funcionarioEstagio.setSalario(new BigDecimal(15000));
		
		// calcular nosso reajuste aqui
		reajusteAnualSalario.calcularReajusteAnual(funcionarioCLT);
		reajusteAnualSalario.calcularReajusteAnual(funcionarioPJ);
		reajusteAnualSalario.calcularReajusteAnual(funcionarioEstagio);
		
		System.out.println(funcionarioCLT);
		System.out.println(funcionarioPJ);
		System.out.println(funcionarioEstagio);
	}
	
}