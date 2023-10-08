package br.edu.ifpe.draw;

public class Quadrado extends Forma {
	private Double lado;
	
	public Quadrado(Double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		Double lado = getLado();
		Double area = lado * lado;
		return area;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}
	
}
