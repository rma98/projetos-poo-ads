package br.edu.ifpe.meuBanco;

public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
