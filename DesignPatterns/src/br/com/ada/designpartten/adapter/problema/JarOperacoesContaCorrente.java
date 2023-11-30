package br.com.ada.designpartten.adapter.problema;

import java.math.BigDecimal;

public class JarOperacoesContaCorrente {

	public boolean validaSaldo(BigDecimal valorPrentendidoSaque) {
		System.out.println("Validando o saldo...");
		return true;
	}
	
	public void sacar(BigDecimal valorPrentendido) {
		System.out.println("Sacando...");
	}
	
	public void depositar(BigDecimal valor) {
		System.out.println("Depositando...");
	}
}
