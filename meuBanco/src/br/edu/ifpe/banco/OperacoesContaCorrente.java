package br.edu.ifpe.banco;

public class OperacoesContaCorrente {
	public void creditarConta(ContaCorrente conta, Double valor) {
		Double saldoAtual = conta.getSaldo();
		
		// Verifica se o valor a ser creditado é positivo.
		if (valor > 0) {
			// Soma o valor ao saldo atual.
			Double novoSaldo = saldoAtual + valor;
			conta.setSaldo(novoSaldo);
			System.out.println("Crédito de " + valor + " realizado com sucesso.");
		} else {
			System.out.println("O valor a ser creditado deve ser positivo");
		}
	}
}
