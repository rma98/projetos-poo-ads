package br.edu.ifpe.draw;

import java.util.ArrayList;
import java.util.List;

public class Desenho {
	private List<Forma> formas;
	
	public Desenho() {
		this.formas = new ArrayList<>();
	}
	
	public double calcularAreaTotal() {
		Double areaTotal = 0.0;
		for (Forma forma : formas) {
			areaTotal += forma.calcularArea();
		}
		return areaTotal;
	}

	public List<Forma> getFormas() {
		return formas;
	}

	public void setFormas(List<Forma> formas) {
		this.formas = formas;
	}
	
}
