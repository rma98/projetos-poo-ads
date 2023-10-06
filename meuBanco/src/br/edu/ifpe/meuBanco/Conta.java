package br.edu.ifpe.meuBanco;

public class Conta<T> {
	private T numConta;
	private T numAgencia;
	private T saldo;
	
	public Conta(T numConta, T numAgencia, T saldo) {
		this.numConta = numConta;
		this.numAgencia = numAgencia;
		this.saldo = saldo;
	}

	public T getNumConta() {
		return numConta;
	}

	public void setNumConta(T numConta) {
		this.numConta = numConta;
	}

	public T getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(T numAgencia) {
		this.numAgencia = numAgencia;
	}

	public T getSaldo() {
		return saldo;
	}

	public void setSaldo(T saldo) {
		this.saldo = saldo;
	}
	
}
