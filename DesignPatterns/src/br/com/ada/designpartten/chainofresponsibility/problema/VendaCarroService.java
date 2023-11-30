package br.com.ada.designpartten.chainofresponsibility.problema;

import java.math.BigDecimal;

import br.com.ada.designpartten.chainofresponsibility.Carro;
import br.com.ada.designpartten.chainofresponsibility.Marca;

public class VendaCarroService {

	public BigDecimal calcularValorVenda(Carro carro) {
		BigDecimal valorVenda = carro.getPreco();
		
		if (Marca.FIAT.equals(carro.getMarca())) {
			return valorVenda.subtract(new BigDecimal(1000));
		}
		
		if (Marca.FORD.equals(carro.getMarca())) {
			return valorVenda.subtract(new BigDecimal(2000));
		}
		
		if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0) {
			return valorVenda.subtract(new BigDecimal(10000));
		}
		
		return valorVenda;
	}
}
