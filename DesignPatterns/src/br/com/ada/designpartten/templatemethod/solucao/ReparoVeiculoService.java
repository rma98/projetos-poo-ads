package br.com.ada.designpartten.templatemethod.solucao;

public abstract class ReparoVeiculoService {

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
	
	protected abstract boolean veiculoParaReparo();
	
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
	
	protected void entradaOficina() {
		System.out.println("Veiculo entrando oficina...");
	}
}