package br.com.ada.designpartten.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.chainofresponsibility.Carro;

public class DescontoCarroValorMaiorQueCemMil extends DescontoCarro {

	public DescontoCarroValorMaiorQueCemMil(DescontoCarro proximoDesconto) {
		super(proximoDesconto);
	}

	@Override
	public BigDecimal aplicandoDesconto(Carro carro) {
		BigDecimal valorVenda = carro.getPreco();
		if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0) {
			return valorVenda.subtract(new BigDecimal(10000));
		}
		
		return proximoDesconto.aplicandoDesconto(carro);
	}

}
