package br.com.ada.designpartten.adapter.problema;

import java.math.BigDecimal;

public class ClienteJarOperacoesContaCorrente {
	private JarOperacoesContaCorrente jooc;
	
	public ClienteJarOperacoesContaCorrente(JarOperacoesContaCorrente jocc) {
		this.jooc = jocc;
	}

	public boolean validarSaldo(BigDecimal valorPretendidoSaque) {
		return jooc.validaSaldo(valorPretendidoSaque);
	}
	
	public void sacar(BigDecimal valorPretendido) {
		jooc.sacar(valorPretendido);
	}
	
	public void depositar(BigDecimal valor) {
		jooc.depositar(valor);
	}
}
