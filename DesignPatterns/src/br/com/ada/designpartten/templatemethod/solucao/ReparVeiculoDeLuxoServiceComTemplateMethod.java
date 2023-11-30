package br.com.ada.designpartten.templatemethod.solucao;

import br.com.ada.designpartten.templatemethod.VeiculoParaReparo;

public class ReparVeiculoDeLuxoServiceComTemplateMethod extends ReparoVeiculoService {

	private VeiculoParaReparo veiculoParaReparo;
	
	public ReparVeiculoDeLuxoServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
		this.veiculoParaReparo = veiculoParaReparo;
	}

	@Override
	protected boolean veiculoParaReparo() {
		return veiculoParaReparo.getPorcentagemDano() <= 50;
	}
	
}
