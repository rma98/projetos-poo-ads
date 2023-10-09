package br.edu.ifpe.adsNoiteProva01;

public class Cliente extends Pessoa {
	private int quantidadeOcupacoes;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String nome, String rg, int quantidadeOcupacoes) {
		super(nome, rg);
		this.quantidadeOcupacoes = quantidadeOcupacoes;
	}

	public int getQuantidadeOcupacoes() {
		return quantidadeOcupacoes;
	}

	public void setQuantidadeOcupacoes(int quantidadeOcupacoes) {
		this.quantidadeOcupacoes = quantidadeOcupacoes;
	}
	
}
