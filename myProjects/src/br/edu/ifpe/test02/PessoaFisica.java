package br.edu.ifpe.test02;

// Subclasse PessoaFisica
public class PessoaFisica extends Pessoa {
	public String cpf = "123";
	
	public PessoaFisica(String n) {
		super(n);
	}
	
	public void pf() {
		System.out.println("Sou pessoa fisica");
	}
	
}
