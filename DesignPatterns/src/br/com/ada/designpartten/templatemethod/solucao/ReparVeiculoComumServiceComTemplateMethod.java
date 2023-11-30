package br.com.ada.designpartten.templatemethod.solucao;

import br.com.ada.designpartten.templatemethod.VeiculoParaReparo;

public class ReparVeiculoComumServiceComTemplateMethod extends ReparoVeiculoService {

	private VeiculoParaReparo veiculoParaReparo;
	
	public ReparVeiculoComumServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
		this.veiculoParaReparo = veiculoParaReparo;
	}

	@Override
	protected boolean veiculoParaReparo() {
		return veiculoParaReparo.getPorcentagemDano() <= 70;
	}
	
	@Override
	protected void entradaOficina() {
		System.out.println("Entrando na oficina, meu carro é simples, mas está quitado!");
	}
	
}