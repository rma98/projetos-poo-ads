package br.edu.ifpe.adsNoiteProva01;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
	protected String nome;
	protected String rg;
	protected List<Reserva> reservas;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
		this.reservas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
}
