package br.com.ada.designpartten.adapter.problema;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {

	public static void main(String[] args) {
		JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
		ClienteJarOperacoesContaCorrente client = new ClienteJarOperacoesContaCorrente(jarConta);
		
		BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);
		if (client.validarSaldo(valorPretendidoParaSaque)) {
			client.sacar(valorPretendidoParaSaque);
		}
		
		client.depositar(new BigDecimal(500));
	}
}
