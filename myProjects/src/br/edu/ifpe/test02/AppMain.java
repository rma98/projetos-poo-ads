package br.edu.ifpe.test02;

public class AppMain {

	public static void main(String[] args) {
		// Criação de uma pessoa fisica com nome "João"
		Pessoa pessoa1 = new PessoaFisica("João");
		
		// Criação de uma pessoa juridica com nome "Maria"
		Pessoa pessoa2 = new PessoaJuridica("Maria");
		
		// Verifica se pessoa1 é uma instância de PessoaFisica e Pessoa
		System.out.println(pessoa1.nome + " é uma instância de PessoaFisica? " + (pessoa1 instanceof PessoaFisica));
		System.out.println(pessoa1.nome + " é uma instância de Pessoa? " + (pessoa1 instanceof Pessoa));
		
		// Invoca o método pf() no objeto pessoa1
		((PessoaFisica) pessoa1).pf();
		
		// Chma o método calcularImposto no objeto pessoa2, passando pessoa2 como paâmetro
		((PessoaJuridica) pessoa2).calcularImposto(pessoa2);
	}

}
