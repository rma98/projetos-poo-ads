package br.edu.ifpe.draw;

public class Retangulo extends Forma {
	private Double comprimento;
	private Double largura;
	
	public Retangulo(Double comprimento, Double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	@Override
	public double calcularArea() {
		Double comprimento = getComprimento();
		Double largura = getLargura();
		Double area = comprimento * largura;
		return area;
	}

	public Double getComprimento() {
		return comprimento;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}
	
}
