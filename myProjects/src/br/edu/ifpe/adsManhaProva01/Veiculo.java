package br.edu.ifpe.adsManhaProva01;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
	private String numPlaca;
	private String marca;
	private String modelo;
	private Cliente cliente;
	private List<OrdemServico> ordemServicos;
	
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}
	
	public Veiculo(String numPlaca, String marca, String modelo, Cliente cliente) {
		this.numPlaca = numPlaca;
		this.marca = marca;
		this.modelo = modelo;
		this.cliente = cliente;
		this.ordemServicos = new ArrayList<>();
	}

	public String getNumPlaca() {
		return numPlaca;
	}

	public void setNumPlaca(String numPlaca) {
		this.numPlaca = numPlaca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdemServico> getOrdemServicos() {
		return ordemServicos;
	}

	public void setOrdemServicos(List<OrdemServico> ordemServicos) {
		this.ordemServicos = ordemServicos;
	}
	
}
