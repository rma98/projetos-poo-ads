package br.edu.ifpe.animal;

public class Peixe extends Animal {
	private String caracteristicas;

	public Peixe(String nome, int comprimento, int patas, String cor, String ambiente, Double velocidade, String caracteristicas) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristicas = caracteristicas;
	}

	public void dadosPeixe() {
		System.out.println("-------------- DADOS DO PEIXE --------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Comrpimento: " + getComprimento() + "cm");
		System.out.println("Patas: " + getPatas());
		System.out.println("Cor: " + getCor());
		System.out.println("Ambiente: " + getAmbiente());
		System.out.println("Velocidade: " + getVelocidade() + " m/s");
		System.out.println("Características: " + getCaracteristicas());
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
}
