package br.com.ada.designpartten.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.chainofresponsibility.Carro;
import br.com.ada.designpartten.chainofresponsibility.Marca;

public class DescontoCarroFIAT extends DescontoCarro {

	public DescontoCarroFIAT(DescontoCarro proximoDesconto) {
		super(proximoDesconto);
	}

	@Override
	public BigDecimal aplicandoDesconto(Carro carro) {
		BigDecimal valorVenda = carro.getPreco();
		if (Marca.FIAT.equals(carro.getMarca())) {
			return valorVenda.subtract(new BigDecimal(1000));
		}
		
		return proximoDesconto.aplicandoDesconto(carro);
	}

}