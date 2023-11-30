package br.com.ada.designpartten.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.chainofresponsibility.Carro;
import br.com.ada.designpartten.chainofresponsibility.Marca;

public class TesteVendaCarroComChainOfResponsibility {

	public static void main(String[] args) {
		
		VendaCarroServiceComChainOfResponsibility vendaCarroService = new VendaCarroServiceComChainOfResponsibility();
		
		Carro carro1 = new Carro();
		carro1.setMarca(Marca.FORD);
		carro1.setModelo("Fusion");
		carro1.setPreco(new BigDecimal(90000.00));
		
		BigDecimal valorVenda1 = vendaCarroService.calcularValorVenda(carro1);
		System.out.println("Valor de venda Fusion: " + carro1.getPreco());
		System.out.println("Valor de venda Fusion com desconto: " + valorVenda1);
		
		Carro carro2 = new Carro();
		carro2.setMarca(Marca.FIAT);
		carro2.setModelo("Uno");
		carro2.setPreco(new BigDecimal(40000.00));
		
		BigDecimal valorVenda2 = vendaCarroService.calcularValorVenda(carro2);
		System.out.println("Valor de venda Uno: " + carro2.getPreco());
		System.out.println("Valor de venda Uno com desconto: " + valorVenda2);
		
		Carro carro3 = new Carro();
		carro3.setMarca(Marca.CHERVROLET);
		carro3.setModelo("Camaro");
		carro3.setPreco(new BigDecimal(200000.00));
		
		BigDecimal valorVenda3 = vendaCarroService.calcularValorVenda(carro3);
		System.out.println("Valor de venda Camaro: " + carro3.getPreco());
		System.out.println("Valor de venda Camaro com desconto: " + valorVenda3);
	}
}
