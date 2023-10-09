package br.edu.ifpe.adsNoiteProva01;

public class Funcionario extends Pessoa {
	private String setor;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario(String nome, String rg, String setor) {
		super(nome, rg);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
}
