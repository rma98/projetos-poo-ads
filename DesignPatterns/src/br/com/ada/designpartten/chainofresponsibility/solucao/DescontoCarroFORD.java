package br.com.ada.designpartten.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.chainofresponsibility.Carro;
import br.com.ada.designpartten.chainofresponsibility.Marca;

public class DescontoCarroFORD extends DescontoCarro {

	public DescontoCarroFORD(DescontoCarro proximoDesconto) {
		super(proximoDesconto);
	}

	@Override
	public BigDecimal aplicandoDesconto(Carro carro) {
		BigDecimal valorVenda = carro.getPreco();
		if (Marca.FORD.equals(carro.getMarca())) {
			return valorVenda.subtract(new BigDecimal(2000));
		}
		
		return proximoDesconto.aplicandoDesconto(carro);
	}

}
