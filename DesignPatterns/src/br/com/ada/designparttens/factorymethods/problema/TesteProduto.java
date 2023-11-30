package br.com.ada.designparttens.factorymethods.problema;

import br.com.ada.designparttens.factorymethods.ProdutoDigital;
import br.com.ada.designparttens.factorymethods.ProdutoFisico;

public class TesteProduto {
	
	public static void main(String[] args) {
		
		ProdutoFisico produtoFisico = new ProdutoFisico();
		produtoFisico.setPossuiDimensoesFisicas(true);
		
		ProdutoDigital produtoDigital = new ProdutoDigital();
		produtoDigital.setPossuiDimensoesFisicas(false);
	}
}
