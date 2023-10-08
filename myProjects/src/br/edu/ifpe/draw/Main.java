package br.edu.ifpe.draw;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static List<Desenho> desenhos = new ArrayList<>();

	public static void main(String[] args) {
		Desenho desenho = new Desenho();
		Desenho desenho2 = new Desenho();
		
		Forma tr1 = new Triangulo(5.0, 3.0);
		Forma re1 = new Retangulo(4.0, 2.0);
		
		desenho.getFormas().add(tr1);
		desenho.getFormas().add(re1);
		
		Forma tr2 = new Triangulo(5.0, 3.0);
		Forma qua = new Quadrado(4.0);
		
		desenho2.getFormas().add(tr2);
		desenho2.getFormas().add(qua);
		
		desenhos.add(desenho);
		desenhos.add(desenho2);
		
		for (Forma forma : desenho.getFormas()) {
			System.out.println("---------------------");
			if (forma instanceof Triangulo) {
				System.out.println("Área: " + forma.calcularArea() + "m²");
				for (Desenho des : desenhos) {
					System.out.println("---------------------");
					System.out.println("Área total: " + des.calcularAreaTotal() + "m²");
				}
			}
		}
	}

}
