package br.com.ada.designpartten.prototype.problema;

import br.com.ada.designpartten.prototype.Botao;
import br.com.ada.designpartten.prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {
	
	public BotaoVermelho() {
		setCor("Vermelho");
		setAltura(30);
		setLargura(100);
		setTipoBorda(TipoBordaEnum.FINA);
	}
}