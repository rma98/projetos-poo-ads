package br.com.ada.designpartten.prototype.solucao;

import br.com.ada.designpartten.prototype.Botao;
import br.com.ada.designpartten.prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;

public class BotaoRegistry {
	
	private static Map<String, Botao> REGISTRY = new HashMap<>();
	
	static {
		Botao botaoAmarelo = new Botao();
		botaoAmarelo.setCor("Amarelo");
		botaoAmarelo.setAltura(40);
		botaoAmarelo.setLargura(100);
		botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);
		
		Botao botaoVermelho = new Botao();
		botaoVermelho.setCor("Vermelho");
		botaoVermelho.setAltura(30);
		botaoVermelho.setLargura(100);
		botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);
		
		Botao botaoAzul = new Botao();
		botaoAzul.setCor("Azul");
		botaoAzul.setAltura(35);
		botaoAzul.setLargura(125);
		botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);
		
		REGISTRY.put("BOTÃO_AMARELO", botaoAmarelo);
		REGISTRY.put("BOTÃO_VERMELHO", botaoVermelho);
		REGISTRY.put("BOTÃO_AZUL", botaoAzul);
	}
	
	public static Botao getBotao(String chave) {
		return BotaoFactory.getInstance(REGISTRY.get(chave));
	}

	public static void addRegistry(String chave, Botao botao) {
		REGISTRY.put(chave, botao);
	}
	
}