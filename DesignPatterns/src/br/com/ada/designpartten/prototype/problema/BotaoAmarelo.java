package br.com.ada.designpartten.prototype.problema;

import br.com.ada.designpartten.prototype.Botao;
import br.com.ada.designpartten.prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {
	
	public BotaoAmarelo() {
		setCor("Amarelo");
		setAltura(40);
		setLargura(100);
		setTipoBorda(TipoBordaEnum.TRACEJADA);
	}
}