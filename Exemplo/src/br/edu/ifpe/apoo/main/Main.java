package br.edu.ifpe.apoo.main;

import br.edu.ifpe.apoo.apresentacao.FachadaApresentacao;
import br.edu.ifpe.apoo.factory.AppFactory;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;

public class Main {

	public static void main(String[] args) {
	
		FachadaApresentacao apresentacao = AppFactory.criarFachadaApresentacao();
		
		try {
			apresentacao.exibirMenu();
		} catch (ExcecaoAlunoInvalido ex) {
			System.out.println(ex.getMessage());
		}
	}
}
