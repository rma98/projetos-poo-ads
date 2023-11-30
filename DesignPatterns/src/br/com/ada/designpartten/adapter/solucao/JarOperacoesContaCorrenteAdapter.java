package br.com.ada.designpartten.adapter.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.adapter.problema.JarOperacoesContaCorrente;

public class JarOperacoesContaCorrenteAdapter {

	private JarOperacoesContaCorrente jarConta;
	
	public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
		this.jarConta = jarConta;
	}
	
	public void sacar(BigDecimal valorPrentendido) {
		if (jarConta.validaSaldo(valorPrentendido)) {
			jarConta.sacar(valorPrentendido);
		} else {
			throw new IllegalArgumentException("Valor para saque não permitido");
		}
	}
	
	public void depositar(BigDecimal valor) {
		jarConta.depositar(valor);
	}
}