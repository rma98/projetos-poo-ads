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
	
	public void debitarConta(ContaCorrente conta, Double valor) {
		Double saldoAtual = conta.getSaldo();
		
		// Verifica se o valor a ser debitado é positivo e se há saldo suficiente.
		if (valor > 0 && saldoAtual >= valor) {
			// Subtrai o valor do saldo atual.
			Double novoSaldo = saldoAtual - valor;
			conta.setSaldo(novoSaldo);
			System.out.println("Débito de " + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor de débito inválido ou saldo insuficiente.");
		}
	}
}
