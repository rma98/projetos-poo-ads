package br.com.ada.designparttens.singleton.solucao;

import java.util.HashMap;
import java.util.Map;

public enum AgendaSingletonEnum {

	INSTANCE;
	
	private Map<String, Boolean> diasDisponiveis = new HashMap<>();
	
	private AgendaSingletonEnum() {
		diasDisponiveis.put("Domingo", Boolean.TRUE);
		diasDisponiveis.put("Segunda-feira", Boolean.TRUE);
		diasDisponiveis.put("Terça-feira", Boolean.TRUE);
		diasDisponiveis.put("Quarta-feira", Boolean.TRUE);
		diasDisponiveis.put("Quinta-feira", Boolean.TRUE);
		diasDisponiveis.put("Sexta-feira", Boolean.TRUE);
		diasDisponiveis.put("Sábado", Boolean.TRUE);
	}
	
	public static AgendaSingletonEnum getInstance() {
		return INSTANCE;
	}
	
	public Map<String, Boolean> getDias() {
		return diasDisponiveis;
	}
	
	public void ocupa(String dia) {
		diasDisponiveis.replace(dia, Boolean.FALSE);
	}
}
