package br.edu.ifpe.adsManhaProva01;

import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
	private String numOS;
	private String dataExo;
	private String dataConclusao;
	private Funcionario funcionario;
	private List<Servico> servicos;
	
	public OrdemServico(String numOS, String dataExo, String dataConclusao, Funcionario funcionario) {
		this.numOS = numOS;
		this.dataExo = dataExo;
		this.dataConclusao = dataConclusao;
		this.funcionario = funcionario;
		this.servicos = new ArrayList<>();
	}

	public String getNumOS() {
		return numOS;
	}

	public void setNumOS(String numOS) {
		this.numOS = numOS;
	}

	public String getDataExo() {
		return dataExo;
	}

	public void setDataExo(String dataExo) {
		this.dataExo = dataExo;
	}

	public String getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(String dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
}
