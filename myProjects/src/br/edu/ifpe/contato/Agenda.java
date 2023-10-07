package br.edu.ifpe.contato;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifpe.contato.Contato;

public class Agenda {
	private List<Contato> contatos;
	
	public Agenda() {
		this.contatos = new ArrayList<>();
	}
	
	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}
	
	public Contato consultarContato(String nome) {
		for (Contato contato: contatos) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				return contato;
			}
		}
		return null; // Retorna null se o contato não for encontrado
	}
	
	public void alterarContato(String nome, String novoTelefone) {
		for (Contato contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				contato.setTelefone(novoTelefone);
				return; // Encerra o loop após a alteração
			}
		}
	}
	
	public void excluirContato(String nome) {
		contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
	}
}
