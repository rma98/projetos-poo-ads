package br.com.ada.designpartten.prototype.solucao;

import br.com.ada.designpartten.prototype.Botao;
import br.com.ada.designpartten.prototype.TipoBordaEnum;

public class TesteBotaoPrototype {
	
	public static void main(String[] args) {
		Botao botaoVermelho = BotaoRegistry.getBotao("BOTÃO_VERMELHO");
		System.out.println(botaoVermelho);
		
		Botao botaoAzul = BotaoRegistry.getBotao("BOTÃO_AZUL");
		System.out.println(botaoAzul);
		
		Botao botaosAmarelo = BotaoRegistry.getBotao("BOTÃO_AMARELO");
		System.out.println(botaosAmarelo);
		
		botaosAmarelo.setLargura(200);
		System.out.println(botaosAmarelo);
		
		Botao botaosAmarelo2 = BotaoRegistry.getBotao("BOTÃO_AMARELO");
		System.out.println(botaosAmarelo2);
		
		String chave = "BOTÃO_PRETO";
		Botao botaoPreto = new Botao();
		botaoPreto.setCor("Preto");
		botaoPreto.setAltura(50);
		botaoPreto.setLargura(300);
		botaoPreto.setTipoBorda(TipoBordaEnum.FINA);
		
		BotaoRegistry.addRegistry(chave, botaoPreto);
		
		Botao botaosPretoClone = BotaoRegistry.getBotao("BOTÃO_PRETO");
		System.out.println(botaosPretoClone);
	}
}
