package br.edu.ifpe.banco;

public class Main {

	public static void main(String[] args) {
		ContaCorrente contaA = new ContaCorrente("1010", "01", 500.0);
		ContaCorrente contaB = new ContaCorrente("2020", "02", 200.0);
		
		OperacoesContaCorrente operacoesContaCorrente = new OperacoesContaCorrente(); 
		
		Double saldoAtual;
		
		saldoAtual = contaA.getSaldo();
		System.out.println("Saldo atual da conta A: " + saldoAtual);
		operacoesContaCorrente.creditarConta(contaA, 1200.0);
		saldoAtual = contaA.getSaldo();
		System.out.println("Saldo após crédito: " + saldoAtual);
		
		saldoAtual = contaB.getSaldo();
		System.out.println("Saldo atual da conta B: " + saldoAtual);
		operacoesContaCorrente.creditarConta(contaB, 300.0);
		saldoAtual = contaB.getSaldo();
		System.out.println("Saldo após crédito: " + saldoAtual);

	}

}
