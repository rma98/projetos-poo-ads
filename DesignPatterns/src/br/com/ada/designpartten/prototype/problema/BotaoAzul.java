package br.com.ada.designpartten.prototype.problema;

import br.com.ada.designpartten.prototype.Botao;
import br.com.ada.designpartten.prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {
	
	public BotaoAzul() {
		setCor("Azul");
		setAltura(35);
		setLargura(125);
		setTipoBorda(TipoBordaEnum.TRACEJADA);
	}
}