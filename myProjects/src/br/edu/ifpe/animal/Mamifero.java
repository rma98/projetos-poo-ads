package br.edu.ifpe.animal;

public class Mamifero extends Animal {
	private String alimento;
	
	public Mamifero(String nome, int comprimento, int patas, String cor, String ambiente, Double velocidade, String alimento) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dadosMamifero() {
		System.out.println("-------------- DADOS DO MAMÍFERO --------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Comrpimento: " + getComprimento() + "cm");
		System.out.println("Patas: " + getPatas());
		System.out.println("Cor: " + getCor());
		System.out.println("Ambiente: " + getAmbiente());
		System.out.println("Velocidade: " + getVelocidade() + " m/s");
		System.out.println("Alimento: " + getAlimento());
	}
	
}
