package br.edu.ifpe.draw;

public class Triangulo extends Forma {
	private Double base;
	private Double altura;
	
	public Triangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		Double base = getBase();
		Double altura = getAltura();
		Double area = base * altura / 2;
		return area;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
}
