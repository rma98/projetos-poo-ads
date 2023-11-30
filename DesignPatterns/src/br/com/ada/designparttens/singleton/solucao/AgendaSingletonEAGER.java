package br.com.ada.designparttens.singleton.solucao;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER {
private Map<String, Boolean> diasDisponiveis = new HashMap<>();

	private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();
	
	private AgendaSingletonEAGER() {
		diasDisponiveis.put("Domingo", Boolean.TRUE);
		diasDisponiveis.put("Segunda-feira", Boolean.TRUE);
		diasDisponiveis.put("Terça-feira", Boolean.TRUE);
		diasDisponiveis.put("Quarta-feira", Boolean.TRUE);
		diasDisponiveis.put("Quinta-feira", Boolean.TRUE);
		diasDisponiveis.put("Sexta-feira", Boolean.TRUE);
		diasDisponiveis.put("Sábado", Boolean.TRUE);
	}
	
	public static AgendaSingletonEAGER getInstance() {
		return INSTANCE;
	}
	
	public Map<String, Boolean> getDias() {
		return diasDisponiveis;
	}
	
	public void ocupa(String dia) {
		diasDisponiveis.replace(dia, Boolean.FALSE);
	}
}
