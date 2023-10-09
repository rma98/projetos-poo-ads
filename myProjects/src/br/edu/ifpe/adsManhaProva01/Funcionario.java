package br.edu.ifpe.adsManhaProva01;

public class Funcionario extends Pessoa {
	private String especialidade;
	private String dataAdmissao;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario(String nome, String rg, String especialidade, String dataAdmissao) {
		super(nome, rg);
		this.especialidade = especialidade;
		this.dataAdmissao = dataAdmissao;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
}
