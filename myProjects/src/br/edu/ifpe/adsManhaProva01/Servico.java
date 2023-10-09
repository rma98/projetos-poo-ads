package br.edu.ifpe.adsManhaProva01;

public class Servico {
	private String descricao;
	private Double valor;
	
	public Servico() {
		// TODO Auto-generated constructor stub
	}
	
	public Servico(String descricao, Double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
