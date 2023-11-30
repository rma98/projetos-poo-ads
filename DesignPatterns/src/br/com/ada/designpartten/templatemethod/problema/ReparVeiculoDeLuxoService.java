package br.com.ada.designpartten.templatemethod.problema;

import br.com.ada.designpartten.templatemethod.VeiculoParaReparo;

public class ReparVeiculoDeLuxoService {

	private VeiculoParaReparo veiculoParaReparo;
	
	public ReparVeiculoDeLuxoService(VeiculoParaReparo veiculoParaReparo) {
		this.veiculoParaReparo = veiculoParaReparo;
	}
	
	public void reparaVeiculo() {
		entradaOficina();
		analisarDanos();
		if (veiculoParaReparo()) {
			repararVeiculo();
			notificarReparoParaSeguradora();
		} else {
			notificarPerdaTotalParaSeguradora();
		}
	}
	
	private boolean veiculoParaReparo() {
		return veiculoParaReparo.getPorcentagemDano() <= 50;
	}
	
	private void notificarPerdaTotalParaSeguradora() {
		System.out.println("Notificando perda total para seguradora...");
	}
 	
	private void notificarReparoParaSeguradora() {
		System.out.println("Notificando reparo para seguradora");
	}
	
	private void repararVeiculo() {
		System.out.println("Reparando veiculo...");
	}
	
	private void analisarDanos() {
		System.out.println("Analisando Danos...");
	}
	
	private void entradaOficina() {
		System.out.println("Veiculo entrando oficina...");
	}
}
