package br.edu.ifpe.adsNoiteProva01;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
	private String data;
	private Funcionario funcionario;
	private List<Quarto> quartos;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}
	
	public Reserva(String data) {
		this.data = data;
		this.quartos = new ArrayList<>();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(List<Quarto> quartos) {
		this.quartos = quartos;
	}
	
}
