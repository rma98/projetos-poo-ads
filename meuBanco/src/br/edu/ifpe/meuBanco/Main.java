package br.edu.ifpe.meuBanco;

public class Main {

	public static void main(String[] args) {
		try {
			// Criando uma instância de Conta01 com tipo Double para representar o saldo.
			Conta01<Double> conta01 = new Conta01<Double>(123456.0, 654321.0, 1000.0);

			// Criando uma instância de Operações para operações com a conta.
			OperacoesConta<Double> operacoesConta = new OperacoesConta<Double>(conta01);

			// Consultando o saldo da conta.
			Double saldoAtual = operacoesConta.consultarSaldo();
			System.out.println("Saldo atual: " + saldoAtual);

			// Tentando creditar um valor negativo na conta (isso deverá lançar uma exceção).
			operacoesConta.creditarConta(-500.0);
			
			// Creditando um valor na conta.
			operacoesConta.creditarConta(500.0);
			
			// Consultando o saldo novamente após a operação de crédito.
			saldoAtual = operacoesConta.consultarSaldo();
			System.out.println("Saldo após crédito: " + saldoAtual);
		} catch (TipoNaoSuportadoException e){
			System.err.println("Erro ao realizar operação: " + e.getMessage());
		}
	}
}
