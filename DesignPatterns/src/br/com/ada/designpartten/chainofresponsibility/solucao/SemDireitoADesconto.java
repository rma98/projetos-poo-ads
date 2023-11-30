package br.com.ada.designpartten.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.chainofresponsibility.Carro;

public class SemDireitoADesconto extends DescontoCarro {

	public SemDireitoADesconto(DescontoCarro proximoDesconto) {
		super(proximoDesconto);
	}

	@Override
	public BigDecimal aplicandoDesconto(Carro carro) {
		return BigDecimal.ZERO;
	}
}