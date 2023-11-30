package br.com.ada.designpartten.adapter.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.adapter.problema.JarOperacoesContaCorrente;

public class ClientJarOperacoesContaCorrenteAdapater {

	private JarOperacoesContaCorrenteAdapter jarContaAdapter;

	public ClientJarOperacoesContaCorrenteAdapater(JarOperacoesContaCorrenteAdapter jarContaAdapter) {
		this.jarContaAdapter = jarContaAdapter;
	}

	public void sacar(BigDecimal valorPretendido) {
		jarContaAdapter.sacar(valorPretendido);
	}
	
	public void depositar(BigDecimal valor) {
		jarContaAdapter.depositar(valor);
	}

}
