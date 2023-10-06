package br.edu.ifpe.banco;

public class Main {

	public static void main(String[] args) {
		ContaCorrente contaA = new ContaCorrente("1010", "01", 500.0);
		ContaCorrente contaB = new ContaCorrente("2020", "02", 200.0);
		
		Double saldoAtual;
		
		saldoAtual = contaA.getSaldo();
		System.out.println("Saldo atual da conta A: " + saldoAtual);
		
		saldoAtual = contaB.getSaldo();
		System.out.println("Saldo atual da conta B: " + saldoAtual);

	}

}
