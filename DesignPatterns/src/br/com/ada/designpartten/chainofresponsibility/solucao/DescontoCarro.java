package br.com.ada.designpartten.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.chainofresponsibility.Carro;

public abstract class DescontoCarro {

	protected DescontoCarro proximoDesconto;
	
	public DescontoCarro(DescontoCarro proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
	
	public abstract BigDecimal aplicandoDesconto(Carro carro);
}