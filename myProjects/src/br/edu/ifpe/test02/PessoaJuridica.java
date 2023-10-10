package br.edu.ifpe.test02;

public class PessoaJuridica extends PessoaFisica {

	public PessoaJuridica(String n) {
		super(n);
	}
	
	public void pj() {
		System.out.println("Sou pessoa juridica");
	}
	
	public void calcularImposto(Pessoa pessoa) {
		System.out.println("Nome: " + pessoa.nome);
		
		if (pessoa instanceof PessoaFisica) {
			String str = ((PessoaFisica) pessoa).cpf;
			System.out.println("CPF: " + str);
		}
	}
}
