package br.edu.ifpe.meuBanco;

public class OperacoesConta<T extends Comparable<T>> {
	private Conta01<T> conta;
	
	public OperacoesConta(Conta01<T> conta) {
		this.conta = conta;
	}
	
	public void creditarConta(T valor) throws TipoNaoSuportadoException {
		T saldoAtual = conta.getSaldo();
		
		// Verifica se o valor a ser creditado é positivo.
		if (valor.compareTo(zero()) > 0) {
			// Soma o valor ao saldo atual.
			T novoSaldo = somar(saldoAtual, valor);
			conta.setSaldo(novoSaldo);
			System.out.println("Crédito de " + valor + " realizado com sucesso.");
		} else {
			System.out.println("O valor a ser creditado deve ser positivo.");
		}
	}
	
	public T consultarSaldo() {
		return conta.getSaldo();
	}
	
	// Método auxiliar para obter o valor zero do tipo T.
	private T zero() throws TipoNaoSuportadoException {
		// Implementação especifica do tipo T pode variar, mas vamos assumir que T é um tipo numérico.
		if (conta.getSaldo() instanceof Integer) {
			return (T) Integer.valueOf(0);
		} else if (conta.getSaldo() instanceof Double) {
			return (T) Double.valueOf(0.0);
		} else {
			throw new TipoNaoSuportadoException("Tipo não suportado para zero.");
		}
	}
	// Método auxiliar para somar dois valores do tipo T.
	private T somar(T a, T b) throws TipoNaoSuportadoException {
		// Implementação especifica do tipo T pode variar, mas vamos assumir que T é um tipo numérico.
		if (a instanceof Integer && b instanceof Integer) {
			return (T) Integer.valueOf((Integer) a + (Integer) b);
		} else if (a instanceof Double && b instanceof Double) {
			return (T) Double.valueOf((Double) a + (Double) b);
		} else {
			throw new TipoNaoSuportadoException("Tipo não suportado para soma.");
		}
	}
}
