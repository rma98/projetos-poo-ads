package br.com.ada.designpartten.adapter.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.adapter.problema.JarOperacoesContaCorrente;

public class TesteOperacoesContaCorrenteAdapter {

	public static void main(String[] args) {
		JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
		JarOperacoesContaCorrenteAdapter jarContaAdapater = new JarOperacoesContaCorrenteAdapter(jarConta);
		ClientJarOperacoesContaCorrenteAdapater client = new ClientJarOperacoesContaCorrenteAdapater(jarContaAdapater);

		BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

		client.sacar(valorPretendidoParaSaque);


		client.depositar(new BigDecimal(500));
	}
}
