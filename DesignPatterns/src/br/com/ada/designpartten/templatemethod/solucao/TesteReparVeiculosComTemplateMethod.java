package br.com.ada.designpartten.templatemethod.solucao;

import br.com.ada.designpartten.templatemethod.VeiculoParaReparo;

public class TesteReparVeiculosComTemplateMethod {

	public static void main(String[] args) {
		System.out.println("--------------------LUXO--------------------------");
		VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
		veiculoDeLuxo.setPorcentagemDano(49);
		
		ReparoVeiculoService rpl = new ReparVeiculoDeLuxoServiceComTemplateMethod(veiculoDeLuxo);
		
		rpl.reparaVeiculo();
		
		System.out.println("--------------------COMUM--------------------------");
		VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
		veiculoComum.setPorcentagemDano(71);
		
		ReparoVeiculoService rpc = new ReparVeiculoComumServiceComTemplateMethod(veiculoComum);
		
		rpc.reparaVeiculo();
	}
}
