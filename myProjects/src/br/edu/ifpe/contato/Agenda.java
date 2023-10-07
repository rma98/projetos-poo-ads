package br.edu.ifpe.contato;

import java.util.HashSet;
import java.util.Set;
import br.edu.ifpe.contato.Contato;

public class Agenda {
	private Set<Contato> contatos;

	public Agenda() {
		this.contatos = new HashSet<>();
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

	public boolean alterarContato(String nomeOriginal, String novoNome, String novoTelefone) {
		Contato contatoExistente = consultarContato(nomeOriginal);
		if (contatoExistente != null) {
			// Verifique se o novo nome não está vazio e defina-o
			if (!novoNome.isEmpty()) {
				contatoExistente.setNome(novoNome);
			}
			// Verifique se o novo telefone não está vazio e definia-o
			if (!novoTelefone.isEmpty()) {
				contatoExistente.setTelefone(novoTelefone);
			}
			return true; // Contato alterado com sucesso
		}
		return false; // Contato não encontrado
	}

	public boolean excluirContato(String nome) {
		return contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
	}

	// Verifica se um telefone já existe na lista de contatos
	private boolean telefoneExistente(String telefone) {
		for (Contato contato : contatos) {
			if (contato.getTelefone().equalsIgnoreCase(telefone)) {
				return true;
			}
		}
		return false;
	}
}
