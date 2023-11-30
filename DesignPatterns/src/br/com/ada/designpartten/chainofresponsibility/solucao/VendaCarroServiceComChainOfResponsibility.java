package br.com.ada.designpartten.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpartten.chainofresponsibility.Carro;
import br.com.ada.designpartten.chainofresponsibility.Marca;

public class VendaCarroServiceComChainOfResponsibility {

	public BigDecimal calcularValorVenda(Carro carro) {
		DescontoCarro desconto = new DescontoCarroFIAT(new DescontoCarroFORD(
				new DescontoCarroValorMaiorQueCemMil(
						new SemDireitoADesconto(null)
						)));

		return desconto.aplicandoDesconto(carro);
	}
}
